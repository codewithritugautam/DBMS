package com.ritugautambatch4119.StudentB4119SB.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ritugautambatch4119.StudentB4119SB.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long>{
}
