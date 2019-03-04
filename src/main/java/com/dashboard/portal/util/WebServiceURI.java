/**
 * 
 */
package com.dashboard.portal.util;

/**
 * @author Muthu Selvam
 *
 */
public class WebServiceURI {

	// Dashboard Web Service 
	public static final String GET_STUDENT_DETAILS = "/student/getDetails";
	public static final String GET_STUDENT_DETAIL_BY_ID = "/student/getDetails/{id}";
	public static final String REGISTER_STUDENT = "/student/register";
	public static final String UPDATE_STUDENT = "/student/update";
	public static final String DELETE_STUDENT = "/student/delete/{id}";
	
	// Company Web Service 
	public static final String COMPANY_EMPLOYEE_DETAILS = "/company/employee/{branchId}/{gender}";
	public static final String COMPANY_ALL_EMPLOYEE = "/company/employees";

}
