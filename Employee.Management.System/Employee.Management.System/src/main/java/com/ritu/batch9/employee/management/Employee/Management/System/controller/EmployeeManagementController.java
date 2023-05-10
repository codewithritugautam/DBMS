package com.ritu.batch9.employee.management.Employee.Management.System.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ritu.batch9.employee.management.Employee.Management.System.model.EmployeeManagement;
import com.ritu.batch9.employee.management.Employee.Management.System.repository.EmployeeManagementRepository;

@RestController
@RequestMapping("/employee")
public class  EmployeeManagementController {
@Autowired
EmployeeManagementRepository bmr;
@PostMapping("/save")
public void saveBook(@RequestBody  EmployeeManagementController bm) {
bmr.saveAll(bm);
}
@RequestMapping("/details")
public List<EmployeeManagement> getBooks() {
return bmr.findAll();
}
@RequestMapping("/update/{id}/{employeeName}")
public void updateEmployee(@PathVariable("id")Long id,@PathVariable("employeeName")String ename) {
	 EmployeeManagement bmt = bmr.findById(id).get();
bmt.setEmployeeName(ename);
bmr.save(bmt);
}
@RequestMapping("/details/{id}")
public  EmployeeManagement getById(@PathVariable("id")Long id) {
return bmr.findById(id).get();
}
@RequestMapping("/delete/{id}")
public void deleteEmployee(@PathVariable("id")Long id) {
bmr.deleteById(id);
}
}


