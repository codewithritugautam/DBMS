package com.employeebatch4119.EmployeeEx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employeebatch4119.EmployeeEx.Repository.EmployeeRepository;
import com.employeebatch4119.EmployeeEx.model.Employee;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
@Autowired
EmployeeRepository sr;
@RequestMapping("/details")
public java.util.List<Employee> getStudents(){
return this.sr.findAll();
}
}

