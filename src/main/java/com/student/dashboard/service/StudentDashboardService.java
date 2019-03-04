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

import com.student.dashboard.dao.StudentDashboardJPADao;
import com.student.dashboard.model.StudentDashboard;

/**
 * @author Muthu Selvam
 *
 */

@Service
public class StudentDashboardService {

	private static final Logger LOGGER = LoggerFactory.getLogger(StudentDashboardService.class);

	@Autowired
	StudentDashboardJPADao studentDashboardJPADao;

	public List<StudentDashboard> getAllStudentDetails() {
		return studentDashboardJPADao.findAll();
	}

	public StudentDashboard getStudentDetailsById(int id) {
		Optional<StudentDashboard> findByID = studentDashboardJPADao.findById(id);
		StudentDashboard studentDashboard = new StudentDashboard();
		if (findByID.get() == null) {
			throw new RuntimeException("Oops! User not found in the database!!!");
		}
		
		return studentDashboard;
	}

	public StudentDashboard registerStudent(StudentDashboard studentDashboard) {
		LOGGER.info("Query student Object {}" + studentDashboardJPADao.save(studentDashboard));
		return studentDashboardJPADao.save(studentDashboard);
	}

	public StudentDashboard updateStudentDetails(StudentDashboard studentDashboard) {
		return studentDashboardJPADao.save(studentDashboard);
	}

	public String deleteStudentDetails(int id) {
		studentDashboardJPADao.deleteById(id);
		return "Student details deleted successfully.";
	}

}
