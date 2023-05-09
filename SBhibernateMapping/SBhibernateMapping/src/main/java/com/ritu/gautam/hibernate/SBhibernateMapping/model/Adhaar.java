package com.ritu.gautam.hibernate.SBhibernateMapping.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="adhar_info")
public class Adhaar {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="adhaar_id")
	private Long id;
	private int adhaarNum;
	public Long getId() {
	return id;
	}
	public void setId(Long id) {
	this.id = id;
	}
	public int getAdhaarNum() {
	return adhaarNum;
	}
	public void setAdhaarNum(int adhaarNum) {
	this.adhaarNum = adhaarNum;
	}
	public Adhaar(int adhaarNum) {
	super();
}}