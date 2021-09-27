package ncsu.se.backend.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.sql.Types;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import ncsu.se.backend.model.MealRecords;
import ncsu.se.backend.model.StudentDetails;

@Repository
public class StudentRepository {

	@Autowired
	private JdbcTemplate jdbctemplate;

	Date date = new Date(System.currentTimeMillis());

	public List<StudentDetails> getStudentDetailsFromDB(int sid) {

		String sql = "select * from student_detail where id = ?";

		return jdbctemplate.query(sql, new Object[] { sid }, new RowMapper<StudentDetails>() {

			@Override
			public StudentDetails mapRow(ResultSet rs, int rowNum) throws SQLException {
				StudentDetails sd = new StudentDetails();
				sd.setId(sid);
				sd.setFirst_name(rs.getString("first_name"));
				sd.setLast_name(rs.getString("last_name"));
				sd.setEmployed_store(rs.getString("employed_store"));
				sd.setEmployer_name(rs.getString("employer_name"));
				sd.setSchedule(rs.getString("schedule").toString());

				return sd;
			}
		});
	}

	public String addMealRecord(MealRecords mr) {
		String sql = "Insert into meal_info (M_id, id, Meal_cost, Meal_timestamp, Meal_store) values (?,?,?,?,?)";
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());

		Object[] params = new Object[] { mr.getMid(), mr.getSid(), mr.getMeal_cost(), timestamp, mr.getMeal_store() };
		int[] types = new int[] { Types.INTEGER, Types.INTEGER, Types.NUMERIC, Types.TIMESTAMP, Types.VARCHAR };

		jdbctemplate.update(sql, params, types);
		return "Added Meal successfully";
	}

	public void generateDefaultersStudents() {

		List<Integer> ids = getIdsFromMealInfo();

		for (int id : ids) {
			if (!checkShiftVisited(id) || fetchTotalHoursForId(id) > 20) {
				System.out.println(id);
			}

		}
	}

	public int fetchTotalHoursForId(int sid) {
		int sum = 0;
		List<Map<String, Object>> HoursList = new ArrayList();
		String selectSql = "Select total_hours from clock_logs where id = ?";

		HoursList = jdbctemplate.queryForList(selectSql, new Object[] { sid });

		List<Integer> hours = jdbctemplate.query(selectSql, new Object[] { sid }, new RowMapper<Integer>() {
			@Override
			public Integer mapRow(ResultSet rs, int rowNum) throws SQLException {
				int val = rs.getInt("total_hours");
				return val;
			}
		});

		for (int val : hours) {
			sum += val;
		}
		return sum;

	}

	public List<Integer> getIdsFromMealInfo() {
		String selectSql = "SELECT id FROM meal_info WHERE DATE(?) = CURRENT_DATE";
		return jdbctemplate.query(selectSql, new Object[] { date }, new RowMapper<Integer>() {
			@Override
			public Integer mapRow(ResultSet rs, int rowNum) throws SQLException {
				return rs.getInt("id");
			}
		});
	}

	public boolean checkShiftVisited(int sid) {
		String countsql = "Select Count(*) from clock_logs where id = ?";
		int count = this.jdbctemplate.queryForObject(countsql, new Object[] { sid }, Integer.class);
		if (count > 0) {
			return true;
		}
		return false;
	}

}
