/**
 * 
 */
package com.student.dashboard.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

	private static final Logger LOGGER = LoggerFactory.getLogger(StudentDashboardService.class);

	@Autowired
	StudentDashboardRepoistory studentDashboardRepoistory;

	public List<StudentDashboard> getAllStudentDetails() {
		return studentDashboardRepoistory.findAll();
	}

	public StudentDashboard getStudentDetailsById(int id) {
		Optional<StudentDashboard> findByID = studentDashboardRepoistory.findById(id);
		StudentDashboard studentDashboard = new StudentDashboard();
		if (findByID.isPresent()) {
			studentDashboard = findByID.get();
		}
		return studentDashboard;
	}

	public StudentDashboard registerStudent(StudentDashboard studentDashboard) {
		LOGGER.info("Save student Object {}" + studentDashboard);
		LOGGER.info("Query student Object {}" + studentDashboardRepoistory.save(studentDashboard));
		return studentDashboardRepoistory.save(studentDashboard);
	}

	public StudentDashboard updateStudentDetails(StudentDashboard studentDashboard) {
		return studentDashboardRepoistory.save(studentDashboard);
	}

	public String deleteStudentDetails(int id) {
		studentDashboardRepoistory.deleteById(id);
		return "Student details deleted successfully.";
	}

}
