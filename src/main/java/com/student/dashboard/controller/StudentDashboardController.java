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
import com.student.dashboard.util.WebServiceURI;

/**
 * @author Muthu Selvam
 *
 */

@RestController
public class StudentDashboardController {

	@Autowired
	private StudentDashboardService studentDashboardService;
	
	@GetMapping(WebServiceURI.GET_STUDENT_DETAILS)
	public List<StudentDashboard> getListOfStudentDetails() {
		return studentDashboardService.getAllStudentDetails();
	}

	@GetMapping(WebServiceURI.GET_STUDENT_DETAIL_BY_ID)
	public StudentDashboard getStudentdetails(@PathVariable int id) {
		return studentDashboardService.getStudentDetailsById(id);
	}
	
	@PostMapping(WebServiceURI.REGISTER_STUDENT)
	public StudentDashboard registerStudentDetails(@RequestBody StudentDashboard studentDashboard) {
		return studentDashboardService.registerStudent(studentDashboard);
	}
	
	@PostMapping(WebServiceURI.UPDATE_STUDENT)
	public StudentDashboard updateStudentDetails(@RequestBody StudentDashboard studentDashboard) {
		return studentDashboardService.updateStudentDetails(studentDashboard);
	}
	
	@DeleteMapping(WebServiceURI.DELETE_STUDENT)
	public String deleteStudentDetails(@PathVariable int id) {
		return studentDashboardService.deleteStudentDetails(id);
	}
	
}
