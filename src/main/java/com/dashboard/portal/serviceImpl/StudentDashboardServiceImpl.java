/**
 * 
 */
package com.dashboard.portal.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dashboard.portal.daoImpl.StudentDashboardJPADaoImpl;
import com.dashboard.portal.model.StudentDashboard;
import com.dashboard.portal.service.StudentDashboardService;

/**
 * @author Muthu Selvam
 *
 */

@Service
public class StudentDashboardServiceImpl implements StudentDashboardService {

	private static final Logger LOGGER = LoggerFactory.getLogger(StudentDashboardServiceImpl.class);

	@Autowired
	StudentDashboardJPADaoImpl studentDashboardJPADaoImpl;

	@Override
	public List<StudentDashboard> getAllStudentDetails() {
		return studentDashboardJPADaoImpl.findAll();
	}

	@Override
	public StudentDashboard getStudentDetailsById(int id) {
		Optional<StudentDashboard> findByID = studentDashboardJPADaoImpl.findById(id);
		StudentDashboard studentDashboard = new StudentDashboard();
		if (findByID.get() == null) {
			throw new RuntimeException("Oops! User not found in the database!!!");
		}

		return studentDashboard;
	}

	@Override
	public StudentDashboard registerStudent(StudentDashboard studentDashboard) {
		LOGGER.info("Query student Object {}" + studentDashboardJPADaoImpl.save(studentDashboard));
		return studentDashboardJPADaoImpl.save(studentDashboard);
	}

	@Override
	public StudentDashboard updateStudentDetails(StudentDashboard studentDashboard) {
		return studentDashboardJPADaoImpl.save(studentDashboard);
	}

	@Override
	public String deleteStudentDetails(int id) {
		studentDashboardJPADaoImpl.deleteById(id);
		return "Student details deleted successfully.";
	}

}
