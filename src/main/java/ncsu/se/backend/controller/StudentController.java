package ncsu.se.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ncsu.se.backend.model.StudentDetails;
import ncsu.se.backend.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	
	@GetMapping("/studentDetails")
	public StudentDetails getStudentDetails(@RequestParam int sid) {
		System.out.println("Entered the controller with sid" +sid);
		return studentService.getStudentDetails(sid);
	}

}
