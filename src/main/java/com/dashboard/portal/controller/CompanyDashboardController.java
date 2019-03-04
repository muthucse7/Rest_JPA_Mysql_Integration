/**
 * 
 */
package com.dashboard.portal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.dashboard.portal.model.Company;
import com.dashboard.portal.serviceImpl.CompanayDashboardServiceImpl;
import com.dashboard.portal.util.WebServiceURI;

/**
 * @author Muthu Selvam
 *
 */

@RestController
public class CompanyDashboardController {

	@Autowired
	CompanayDashboardServiceImpl companayDashboardServiceImpl;

	@GetMapping(WebServiceURI.COMPANY_EMPLOYEE_DETAILS)
	public List<Company> getEmployeeDetailsByGenderAndBranch(@PathVariable int branchId, @PathVariable String gender) {
		return companayDashboardServiceImpl.getEmployeeDetailsByGenderAndBranch(branchId, gender);
	}
	
	
	@GetMapping(WebServiceURI.COMPANY_ALL_EMPLOYEE)
	public List<Company> getAllEmployee(){
		return companayDashboardServiceImpl.getAllEmployee();
	}

}
