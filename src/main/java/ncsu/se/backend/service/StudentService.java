package ncsu.se.backend.service;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ncsu.se.backend.model.MealRecords;
import ncsu.se.backend.model.StudentDetails;
import ncsu.se.backend.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepo;

	public List<StudentDetails> getStudentDetails(int sid) {
		return studentRepo.getStudentDetailsFromDB(sid);
	}

	public String updateMealRecords(MealRecords mr) {
		return studentRepo.addMealRecord(mr);
	}

	// public String addClockInTime(int sid) {
	// Timestamp clockInTp = new Timestamp(System.currentTimeMillis());
	// return studentRepo.addClockIn(sid, clockInTp);
	// }

}
