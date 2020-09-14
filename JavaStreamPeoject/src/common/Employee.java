package common;
import java.util.*;
import java.time.*;
public class Employee {
	int employeeId;
	String firstname;
	String lastName;
	String email;
	LocalDate hireDate;
	String jobId;
	int salary;
	public Employee() {
		
	}
	
	
	
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", firstname=" + firstname + ", lastName=" + lastName + ", email="
				+ email + ", hireDate=" + hireDate + ", jobId=" + jobId + ", salary=" + salary + "]";
	}



	public Employee(int employeeId, String firstname, String lastName, String email, LocalDate hireDate, String jobId,
			int salary) {
		super();
		this.employeeId = employeeId;
		this.firstname = firstname;
		this.lastName = lastName;
		this.email = email;
		this.hireDate = hireDate;
		this.jobId = jobId;
		this.salary = salary;
	}



	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public LocalDate getHireDate() {
		return hireDate;
	}
	public void setHireDate(LocalDate hireDate) {
		this.hireDate = hireDate;
	}
	public String getJobId() {
		return jobId;
	}
	public void setJobId(String jobId) {
		this.jobId = jobId;
	}
	
	
}
