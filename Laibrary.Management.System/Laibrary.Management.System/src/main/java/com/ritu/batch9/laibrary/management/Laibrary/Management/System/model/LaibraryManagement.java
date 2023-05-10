package com.ritu.batch9.laibrary.management.Laibrary.Management.System.model;
import jakarta.persistence.*;
@Entity
@Table(name="laibrary_mgmt")
public class LaibraryManagement {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="laibrary_mgmt_id")
private String id;
@Column(name="lai_book_name")
private String lai_bookName;
private int lai_bookId;
private String lai_authName;
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getLai_bookName() {
	return lai_bookName;
}
public void setLai_bookName(String lai_bookName) {
	this.lai_bookName = lai_bookName;
}
public int getLai_bookId() {
	return lai_bookId;
}
public void setLai_bookId(int lai_bookId) {
	this.lai_bookId = lai_bookId;
}
public String getLai_authName() {
	return lai_authName;
}
public void setLai_authName(String lai_authName) {
	this.lai_authName = lai_authName;
}
public LaibraryManagement(String lai_bookName, int lai_bookId, String lai_authName) {
	super();
	this.lai_bookName = lai_bookName;
	this.lai_bookId = lai_bookId;
	this.lai_authName = lai_authName;
}
public void LaibraryManagementSystem() {
}
}
