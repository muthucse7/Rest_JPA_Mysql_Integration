/**
 * 
 */
package com.student.dashboard.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.student.dashboard.model.Company;
import com.student.dashboard.service.CompanayDashboardService;
import com.student.dashboard.util.WebServiceURI;

/**
 * @author Muthu Selvam
 *
 */

@RestController
public class CompanyDashboardController {

	@Autowired
	CompanayDashboardService companayDashboardService;

	@GetMapping(WebServiceURI.COMPANY_EMPLOYEE_DETAILS)
	public List<Company> getEmployeeDetailsByGenderAndBranch(@PathVariable int branchId, @PathVariable String gender) {
		return companayDashboardService.getEmployeeDetailsByGenderAndBranch(branchId, gender);
	}
	
	
	@GetMapping(WebServiceURI.COMPANY_ALL_EMPLOYEE)
	public List<Company> getAllEmployee(){
		return companayDashboardService.getAllEmployee();
	}

}
