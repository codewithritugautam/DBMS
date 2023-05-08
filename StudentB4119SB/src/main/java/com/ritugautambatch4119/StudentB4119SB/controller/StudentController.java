package com.ritugautambatch4119.StudentB4119SB.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ritugautambatch4119.StudentB4119SB.model.Student;
import com.ritugautambatch4119.StudentB4119SB.repository.StudentRepository;

@RestController
@RequestMapping("/student")
public class StudentController {
@Autowired
StudentRepository sr;
@RequestMapping("/details")
public List<Student> getStudents(){
return this.sr.findAll();
}
}