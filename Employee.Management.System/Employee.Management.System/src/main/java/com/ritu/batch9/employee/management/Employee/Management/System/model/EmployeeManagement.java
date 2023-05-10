package com.ritu.batch9.employee.management.Employee.Management.System.model;
import jakarta.persistence.*;
@Entity
@Table(name="employee_mgmt")
public class EmployeeManagement{
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="employee_mgmt_id")
private Long id;
@Column(name="employee_name")
private String employeeName;
private int employeeId;
private String employeeauthName;
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getEmployeeName() {
	return employeeName;
}
public void setEmployeeName(String employeeName) {
	this.employeeName = employeeName;
}
public int getEmployeeId() {
	return employeeId;
}
public void setEmployeeId(int employeeId) {
	this.employeeId = employeeId;
}
public String getEmployeeauthName() {
	return employeeauthName;
}
public void setEmployeeauthName(String employeeauthName) {
	this.employeeauthName = employeeauthName;
}
public EmployeeManagement(String employeeName, int employeeId, String employeeauthName) {
	super();
	this.employeeName = employeeName;
	this.employeeId = employeeId;
	this.employeeauthName = employeeauthName;
}
}
