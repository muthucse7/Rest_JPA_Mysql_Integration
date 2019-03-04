/**
 * 
 */
package com.dashboard.portal.daoImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.dashboard.portal.dao.CompanayDashboardDao;
import com.dashboard.portal.model.Company;

/**
 * @author Muthu Selvam
 *
 */

@Repository
public class CompanayDashboardJDBCDaoImpl implements CompanayDashboardDao {

	@Autowired
	JdbcTemplate jdbcTemplate;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.dashboard.portal.dao.CompanayDashboardDao#
	 * getEmployeeDetailsByGenderAndBranch(int, java.lang.String)
	 */
	@Override
	public List<Company> getEmployeeDetailsByGenderAndBranch(int branchId, String gender) {
		List<Company> employeeList = jdbcTemplate.query(
				"SELECT * FROM employee WHERE branch_id =" + branchId + " AND sex =" + "'" + gender + "'",
				new RowMapper<Company>() {

					@Override
					public Company mapRow(ResultSet rs, int rowNum) throws SQLException {
						Company company = new Company();
						company.setEmp_id(Integer.parseInt(rs.getString(1)));
						company.setFirst_name(rs.getString(2));
						company.setLast_name(rs.getString(3));
						company.setBirth_day(new Date());
						// company.setBirth_day(rs.getString(4));
						company.setSex(rs.getString(5));
						company.setSalary(Integer.parseInt(rs.getString(6)));
						company.setSuper_id(Integer.parseInt(rs.getString(7)));
						company.setBranch_id(Integer.parseInt(rs.getString(8)));
						return company;
					}

				});
		return employeeList;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.dashboard.portal.dao.CompanayDashboardDao#getAllEmployee()
	 */
	@Override
	public List<Company> getAllEmployee() {
		List<Company> employeeList = jdbcTemplate.query("SELECT * from employee", new RowMapper<Company>() {

			@Override
			public Company mapRow(ResultSet rs, int rowNum) throws SQLException {
				Company company = new Company();
				company.setEmp_id(Integer.parseInt(rs.getString(1)));
				company.setFirst_name(rs.getString(2));
				company.setLast_name(rs.getString(3));
				company.setBirth_day(new Date());
				company.setSex(rs.getString(5));
				company.setSalary(Integer.parseInt(rs.getString(6)));
				company.setSuper_id(Integer.parseInt(rs.getString(7) != null ? rs.getString(7) : "0"));
				company.setBranch_id(Integer.parseInt(rs.getString(8)));
				return company;
			}

		});
		return employeeList;
	}

}
