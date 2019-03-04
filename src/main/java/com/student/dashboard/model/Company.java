/**
 * 
 */
package com.student.dashboard.model;

import java.util.Date;

/**
 * @author Muthu Selvam
 *
 */

public class Company {

	private int emp_id;
	private String first_name;
	private String last_name;
	private Date birth_day;
	private String sex;
	private int salary;
	private int super_id;
	private int branch_id;

	public Company() {

	}

	/**
	 * @param emp_id
	 * @param first_name
	 * @param last_name
	 * @param birth_day
	 * @param sex
	 * @param salary
	 * @param super_id
	 * @param branch_id
	 */
	public Company(int emp_id, String first_name, String last_name, Date birth_day, String sex, int salary,
			int super_id, int branch_id) {
		super();
		this.emp_id = emp_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.birth_day = birth_day;
		this.sex = sex;
		this.salary = salary;
		this.super_id = super_id;
		this.branch_id = branch_id;
	}

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public Date getBirth_day() {
		return birth_day;
	}

	public void setBirth_day(Date birth_day) {
		this.birth_day = birth_day;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getSuper_id() {
		return super_id;
	}

	public void setSuper_id(int super_id) {
		this.super_id = super_id;
	}

	public int getBranch_id() {
		return branch_id;
	}

	public void setBranch_id(int branch_id) {
		this.branch_id = branch_id;
	}

}
