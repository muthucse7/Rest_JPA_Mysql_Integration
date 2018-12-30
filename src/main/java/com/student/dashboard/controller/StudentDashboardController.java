/**
 * 
 */
package com.student.dashboard.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

	@GetMapping("/students/getDetails/{id}")
	public StudentDashboard getStudentdetails(@PathVariable int id) {
		return studentDashboardService.getStudentDetailsById(id);
	}
	
	/*@GetMapping("/students/getDetails")
	public List<StudentDashboard> getListOfStudentDetails() {
		return studentDashboardService.getAllStudentDetails();
	}*/
	
	/*@PostMapping("/students/register")
	public StudentDashboard registerStudentDetails(@RequestBody StudentDashboard studentDashboard) {
		return studentDashboardService.registerStudent(studentDashboard);
	}*/
	
	/*@PostMapping("/students/delete/{id}")
	public Object deleteStudentDetails(@PathVariable int id) {
		return repoistory.deleteById(id);
	}*/
}
