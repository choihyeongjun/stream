package streams.intermediate;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;
enum Gender{
	MALE,FEMALE;
}
public class Employee {
	String name;
	Gender gender;
	LocalDate dateofBirth;
	double income;
	public Employee(String name, Gender gender, LocalDate dateofBirth, double income) {
		super();
		this.name = name;
		this.gender = gender;
		this.dateofBirth = dateofBirth;
		this.income = income;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGener(Gender gender) {
		this.gender = gender;
	}
	public LocalDate getDateofBirth() {
		return dateofBirth;
	}
	public void setDateofBirth(LocalDate dateofBirth) {
		this.dateofBirth = dateofBirth;
	}
	public double getIncome() {
		return income;
	}
	public void setIncome(double income) {
		this.income = income;
	}
	public boolean isMale() {
		return this.gender==Gender.MALE;
	}
	public boolean isFemale() {
		return this.gender==gender.FEMALE;
	}
	@Override
	public String toString() {
		String str=String.format("(%s, %s, %s,% .2f)",name,gender,dateofBirth,income);
		return str;
	}
	public static List<Employee> employees(){
		Employee e1=new Employee("Hong",Gender.MALE,LocalDate.of(1991,Month.JANUARY,1),2343.0);
		Employee e2=new Employee("Hwang",Gender.FEMALE,LocalDate.of(1992,Month.JULY,1),7100.0);
		Employee e3=new Employee("Choi",Gender.MALE,LocalDate.of(1993,Month.MAY,1),5455.0);
		Employee e4=new Employee("Park",Gender.FEMALE,LocalDate.of(1996,Month.AUGUST,1),1800.0);
		Employee e5=new Employee("Kim",Gender.MALE,LocalDate.of(1998,Month.DECEMBER,1),1234.0);
		Employee e6=new Employee("Ryu",Gender.FEMALE,LocalDate.of(1994,Month.JUNE,1),3221.0);
		List<Employee> employees=Arrays.asList(e1,e2,e3,e4,e5,e6);
		return employees;
		
		
		
	}
	
	
	
}
