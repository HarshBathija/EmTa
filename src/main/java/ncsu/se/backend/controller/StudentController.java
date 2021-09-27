package ncsu.se.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ncsu.se.backend.model.MealRecords;
import ncsu.se.backend.model.StudentDetails;
import ncsu.se.backend.repository.StudentRepository;
import ncsu.se.backend.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;

	@Autowired
	private StudentRepository studentrepo;

	@GetMapping("/studentDetails")
	public List<StudentDetails> getStudentDetails(@RequestParam int sid) {
		return studentService.getStudentDetails(sid);
	}

	@PostMapping("/updateMealRecord")
	public String updateMealRecord(@RequestBody MealRecords mr) {
		return studentService.updateMealRecords(mr);
	}

	@GetMapping("/getDefaultersList")
	public String getDefaultersList() {
		studentrepo.generateDefaultersStudents();
		return "generated successfully";
	}
}

// @GetMapping("/addClockIn")
// public String addClockInTime(@RequestParam int sid){
// return studentService.addClockInTime(sid);
// }
