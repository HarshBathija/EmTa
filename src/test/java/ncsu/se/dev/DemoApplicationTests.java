package ncsu.se.dev;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;

import ncsu.se.backend.DemoApplication;
import ncsu.se.backend.model.MealRecords;
import ncsu.se.backend.model.StudentDetails;
import ncsu.se.backend.service.StudentService;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=DemoApplication.class)
class DemoApplicationTests {
	
	@Autowired
	private StudentService studentService;

	@Test
	public void test_getStudentDetails() throws Exception {
		System.out.println("Testing Student Details...\n");
		StudentDetails sd = new StudentDetails();
		List<StudentDetails> listsd = new ArrayList();
		
		
		listsd = studentService.getStudentDetails(200099333);
		sd = (StudentDetails) listsd.toArray()[0];

		System.out.println(sd.getId());
		
		Assertions.assertEquals(200099333,sd.getId());
		
	}

	@Test
	public void test_addMealRecord() throws Exception {
		System.out.println("Testing Addition of Meal Details...\n");
		MealRecords mr = new MealRecords(200099333, 6, "JasonDeli");
		
		String res = "Added Meal successfully";
		Assertions.assertEquals(res,studentService.updateMealRecords(mr));
		
	}
	

}
