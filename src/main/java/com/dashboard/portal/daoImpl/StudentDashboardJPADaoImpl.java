/**
 * 
 */
package com.dashboard.portal.daoImpl;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dashboard.portal.model.StudentDashboard;

/**
 * @author Muthu Selvam
 *
 */

@Repository
public interface StudentDashboardJPADaoImpl extends JpaRepository<StudentDashboard, Integer> {
}
