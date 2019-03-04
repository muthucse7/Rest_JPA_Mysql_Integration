/**
 * 
 */
package com.student.dashboard.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.dashboard.dao.CompanayDashboardJDBCDao;
import com.student.dashboard.model.Company;

/**
 * @author Muthu Selvam
 *
 */

@Service
public class CompanayDashboardService {

	@Autowired
	CompanayDashboardJDBCDao companayDashboardJDBCDao;

	/**
	 * @param branchId
	 * @param gender
	 * @return
	 */
	public List<Company> getEmployeeDetailsByGenderAndBranch(int branchId, String gender) {
		return companayDashboardJDBCDao.getEmployeeDetailsByGenderAndBranch(branchId, gender);
	}

	/**
	 * @return
	 */
	public List<Company> getAllEmployee() {
		return companayDashboardJDBCDao.getAllEmployee();
	}

}
