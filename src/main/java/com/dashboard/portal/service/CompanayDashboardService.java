/**
 * 
 */
package com.dashboard.portal.service;

import java.util.List;

import com.dashboard.portal.model.Company;

/**
 * @author Muthu Selvam
 *
 */
public interface CompanayDashboardService {

	public List<Company> getEmployeeDetailsByGenderAndBranch(int branchId, String gender);

	List<Company> getAllEmployee();
}
