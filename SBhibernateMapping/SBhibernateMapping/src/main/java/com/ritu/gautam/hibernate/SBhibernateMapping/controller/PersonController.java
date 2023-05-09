package com.ritu.gautam.hibernate.SBhibernateMapping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ritu.gautam.hibernate.SBhibernateMapping.model.Person;
import com.ritu.gautam.hibernate.SBhibernateMapping.repository.PersonRepository;

@RestController
@RequestMapping("/person")
public class PersonController {
@Autowired
PersonRepository pr;
@RequestMapping("/details")
public List<Person> getPersonDetails() {
	return pr.findAll();
}
@RequestMapping("/details/{id}") //ek person ki id dekne k liye
public Person getByPerson(@PathVariable("id")Long id) {
	return pr.findById(id).get();
}
@RequestMapping("/details/{id}/{name}") //update krne k liye
public String UpdatePerson(@PathVariable("id") Long id,@PathVariable("name") String name) {
	Person p1 = pr.findById(id).get();
	p1.setName(name);
	pr.save(p1);
	return "Updated "+id+"with"+name; //delete id
	}  
	@RequestMapping("/details/delete/{id}")
	public String deltePerson(@PathVariable("id")Long id) {
	pr.deleteById(id);
	return "Deleted Person with id :"+id;
	}
	}



