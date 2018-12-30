/**
 * 
 */
package com.student.dashboard.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.student.dashboard.model.StudentDashboard;

/**
 * @author Muthu Selvam
 *
 */

@Repository
@Transactional
public class StudentDashboardRepoistory {
	
	@PersistenceContext
	EntityManager enitityManager;
	
	public StudentDashboard retrieveStudentDetails(int id) {
		return enitityManager.find(StudentDashboard.class, id);
	}

}
