/**
 * 
 */
package com.dashboard.portal.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Muthu Selvam
 *
 */

@Entity
@Table(name = "student_entry")
public class StudentDashboard {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "STUDENT_ID")
	private int studentId;

	@Column(name = "STUDENT_NAME")
	private String studentName;

	@Column(name = "DEPARTMENT")
	private String department;

	@Column(name = "PASSING_YEAR")
	private int passingYear;

	public StudentDashboard() {
	}

	/**
	 * @param studentId
	 * @param studentName
	 * @param department
	 * @param passingYear
	 */
	public StudentDashboard(int studentId, String studentName, String department, int passingYear) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.department = department;
		this.passingYear = passingYear;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getPassingYear() {
		return passingYear;
	}

	public void setPassingYear(int passingYear) {
		this.passingYear = passingYear;
	}

}
