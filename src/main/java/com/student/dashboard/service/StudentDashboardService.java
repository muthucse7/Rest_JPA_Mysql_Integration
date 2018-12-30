/**
 * 
 */
package com.student.dashboard.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.dashboard.dao.StudentDashboardRepoistory;
import com.student.dashboard.model.StudentDashboard;

/**
 * @author Muthu Selvam
 *
 */

@Service
public class StudentDashboardService {

	@Autowired
	StudentDashboardRepoistory studentDashboardRepoistory;

	public StudentDashboard getStudentDetailsById(int id) {
		return studentDashboardRepoistory.retrieveStudentDetails(id);
	}

}
