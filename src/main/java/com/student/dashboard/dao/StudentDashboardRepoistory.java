/**
 * 
 */
package com.student.dashboard.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.student.dashboard.model.StudentDashboard;

/**
 * @author Muthu Selvam
 *
 */

@Repository
public interface StudentDashboardRepoistory extends JpaRepository<StudentDashboard, Integer> {
}
