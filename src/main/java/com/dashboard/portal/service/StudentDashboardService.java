/**
 * 
 */
package com.dashboard.portal.service;

import java.util.List;

import com.dashboard.portal.model.StudentDashboard;

/**
 * @author Muthu Selvam
 *
 */
public interface StudentDashboardService {

	public List<StudentDashboard> getAllStudentDetails();

	public StudentDashboard getStudentDetailsById(int id);

	public StudentDashboard registerStudent(StudentDashboard studentDashboard);

	public StudentDashboard updateStudentDetails(StudentDashboard studentDashboard);

	public String deleteStudentDetails(int id);
	
}
