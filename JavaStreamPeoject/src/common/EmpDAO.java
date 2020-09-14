package common;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmpDAO {

	public static List<Employee> getEmplist() {
		
		Connection conn = ConnectDB.getConnection();
		List<Employee> list = new ArrayList<>();
		try {
			String sql = "select * from emp_temp";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			
			while (rs.next()) {
				Employee emp = new Employee();
				String firstName = rs.getString("first_name");
				emp.setFirstname(firstName);
				emp.setLastName(rs.getString("last_name"));
				emp.setEmployeeId(rs.getInt("employee_id"));
				//emp.setHireDate(rs.getString("hire_date"));
				emp.setHireDate(rs.getDate("hire_date").toLocalDate());	
				emp.setEmail(rs.getString("email"));
				emp.setJobId(rs.getString("job_id"));
				emp.setSalary(rs.getInt("salary"));
				list.add(emp);
			}
			System.out.println("---- end of data --");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
	}

}
