/**
 * 
 */
package com.student.dashboard.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.student.dashboard.model.StudentDashboard;
import com.student.dashboard.service.StudentDashboardService;

/**
 * @author Muthu Selvam
 *
 */

@RestController
public class StudentDashboardController {

	@Autowired
	private StudentDashboardService studentDashboardService;
	
	@GetMapping("/student/getDetails")
	public List<StudentDashboard> getListOfStudentDetails() {
		return studentDashboardService.getAllStudentDetails();
	}

	@GetMapping("/student/getDetails/{id}")
	public StudentDashboard getStudentdetails(@PathVariable int id) {
		return studentDashboardService.getStudentDetailsById(id);
	}
	
	@PostMapping("/student/register")
	public StudentDashboard registerStudentDetails(@RequestBody StudentDashboard studentDashboard) {
		return studentDashboardService.registerStudent(studentDashboard);
	}
	
	@PostMapping("/student/update")
	public StudentDashboard updateStudentDetails(@RequestBody StudentDashboard studentDashboard) {
		return studentDashboardService.updateStudentDetails(studentDashboard);
	}
	
	@DeleteMapping("/student/delete/{id}")
	public String deleteStudentDetails(@PathVariable int id) {
		return studentDashboardService.deleteStudentDetails(id);
	}
	
}
