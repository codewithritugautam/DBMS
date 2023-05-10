package com.ritu.batch9.employee.management.Employee.Management.System.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ritu.batch9.employee.management.Employee.Management.System.model.EmployeeManagement;

@Repository
public interface EmployeeManagementRepository extends JpaRepository<EmployeeManagement,Long>{


}
