package com.employeebatch4119.EmployeeEx.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employeebatch4119.EmployeeEx.model.Employee;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long>{
}
