/**
 * 
 */
package com.dashboard.portal.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dashboard.portal.daoImpl.CompanayDashboardJDBCDaoImpl;
import com.dashboard.portal.model.Company;
import com.dashboard.portal.service.CompanayDashboardService;

/**
 * @author Muthu Selvam
 *
 */

@Service
public class CompanayDashboardServiceImpl implements CompanayDashboardService{

	@Autowired
	CompanayDashboardJDBCDaoImpl companayDashboardJDBCDaoImpl;

	/* (non-Javadoc)
	 * @see com.dashboard.portal.serviceImpl.dao.CompanayDashboardServiceDao#getEmployeeDetailsByGenderAndBranch(int, java.lang.String)
	 */
	@Override
	public List<Company> getEmployeeDetailsByGenderAndBranch(int branchId, String gender) {
		return companayDashboardJDBCDaoImpl.getEmployeeDetailsByGenderAndBranch(branchId, gender);
	}

	/* (non-Javadoc)
	 * @see com.dashboard.portal.serviceImpl.dao.CompanayDashboardServiceDao#getAllEmployee()
	 */
	@Override
	public List<Company> getAllEmployee() {
		return companayDashboardJDBCDaoImpl.getAllEmployee();
	}


}
