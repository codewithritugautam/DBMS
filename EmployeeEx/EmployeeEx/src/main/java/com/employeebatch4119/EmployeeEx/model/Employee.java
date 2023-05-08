package com.employeebatch4119.EmployeeEx.model;
import jakarta.persistence.*;
@Entity
@Table(name="employee_info")
public class  Employee {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="employ_id")
private int id;
private String name;
private String CollName;
private String emailid;
public int getId() {
return id;
}
public void setId(int id) {
this.id = id;
}
public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
public String getCollName() {
return CollName;
}
public void setCollName(String collName) {
CollName = collName;
}
public String getEmailid() {
return emailid;
}
public void setEmailid(String emailid) {
this.emailid = emailid;
}
public  Employee(String name, String collName, String emailid) {
super();
this.name = name;
CollName = collName;
this.emailid = emailid;
}
public  Employee() {
}
}
