package com.ritu.gautam.hibernate.SBhibernateMapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ritu.gautam.hibernate.SBhibernateMapping.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person,Long>{
}
