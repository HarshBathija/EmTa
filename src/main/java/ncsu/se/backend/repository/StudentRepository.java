package ncsu.se.backend.repository;

import org.springframework.stereotype.Repository;

import ncsu.se.backend.model.StudentDetails;

@Repository
public class StudentRepository {

	public StudentDetails getStudentDetailsFromDB(int sid) {
		return new StudentDetails(sid, "Harsh", "CS") ;
	}

}
