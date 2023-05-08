package com.ritugautambatch4119.StudentB4119SB;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ritugautambatch4119.StudentB4119SB.model.Student;
import com.ritugautambatch4119.StudentB4119SB.repository.StudentRepository;

@SpringBootApplication
public class StudentB4119SbApplication implements CommandLineRunner{
@Autowired
StudentRepository sr;
public static void main(String[] args) {
SpringApplication.run(StudentB4119SbApplication.class, args);
}
@Override
public void run(String... args) throws Exception {
this.sr.save(new Student("Arun Kumar","Anudeep","arun.kumar@gmail.com"));
this.sr.save(new Student("Deepak Yadhav","Anudeep","deepak.yadhav@gmail.com"));
}
}
