package com.ritu.gautam.hibernate.SBhibernateMapping;
import  com.ritu.gautam.hibernate.SBhibernateMapping.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ritu.gautam.hibernate.SBhibernateMapping.repository.PersonRepository;
@SpringBootApplication
public class SBhibernateMappingApplication implements CommandLineRunner{
@Autowired
PersonRepository pr;
public static void main(String[] args) {
SpringApplication.run(SBhibernateMappingApplication.class, args);
}
@Override
public void run(String... args) throws Exception {
Person p1 = new Person("Aryan Srivastav","Lucknow");
Person p2 = new Person("Ritu Gautam","ghaziabad");
Adhaar a1 = new Adhaar(12345);
Adhaar a2 = new Adhaar(45678);
p1.setAdha(a1);
p2.setAdha(a2);
pr.save(p1);
pr.save(p2);
}
}
