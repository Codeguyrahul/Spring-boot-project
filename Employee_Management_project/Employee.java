package com.rahul.springboot.project.springboot.EmployeeManagementSystem.project.model;

import jakarta.persistence.*;


@Entity
@Table(name="Employee_Information")
public class Employee {
@Id 
@GeneratedValue(strategy= GenerationType.IDENTITY)
@Column(name= "employee_id")
private Long id;
@Column (name= "employee_Name")
private String employee_Name;
private String employee_Designation;
private int employee_Salary;
private String employee_emailid;
private String employee_Address;

public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getEmployee_Name() {
	return employee_Name;
}
public void setEmployee_Name(String employee_Name) {
	this.employee_Name = employee_Name;
}
public String getEmployee_Designation() {
	return employee_Designation;
}
public void setEmployee_Designation(String employee_Designation) {
	this.employee_Designation = employee_Designation;
}
public int getEmployee_Salary() {
	return employee_Salary;
}
public void setEmployee_Salary(int employee_Salary) {
	this.employee_Salary = employee_Salary;
}
public String getEmployee_emailid() {
	return employee_emailid;
}
public void setEmployee_emailid(String employee_emailid) {
	this.employee_emailid = employee_emailid;
}
public String getEmployee_Address() {
	return employee_Address;
}
public void setEmployee_Address(String employee_Address) {
	this.employee_Address = employee_Address;
}
public Employee(String employee_Name, String employee_Designation, int employee_Salary, String employee_emailid,
		String employee_Address) {
	super();
	this.employee_Name = employee_Name;
	this.employee_Designation = employee_Designation;
	this.employee_Salary = employee_Salary;
	this.employee_emailid = employee_emailid;
	this.employee_Address = employee_Address;
}
public Employee() {

}

}
