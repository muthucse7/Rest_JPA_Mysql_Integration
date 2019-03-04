/**
 * 
 */
package com.dashboard.portal.dao;

import java.util.List;

import com.dashboard.portal.model.Company;

/**
 * @author Muthu Selvam
 *
 */
public interface CompanayDashboardDao {

	public List<Company> getEmployeeDetailsByGenderAndBranch(int branchId, String gender);

	List<Company> getAllEmployee();
}
