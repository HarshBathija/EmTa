package ncsu.se.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ncsu.se.backend.model.StudentDetails;
import ncsu.se.backend.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepo;

	public StudentDetails getStudentDetails(int sid) {
		return studentRepo.getStudentDetailsFromDB(sid);
	}
	
	
}
