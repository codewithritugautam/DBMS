package com.ritu.gautam.hibernate.SBhibernateMapping.model;
import jakarta.persistence.*;
@Entity
@Table(name="person_infor")
public class Person {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="person_id")
private Long id;
@Column(name="person_name")
private String name;
@Column(name="person_address")
private String address;
@OneToOne(cascade=CascadeType.ALL)
@JoinColumn(name="adhaar_id")
private Adhaar adha;
public Adhaar getAdha() {
return adha;
}
public void setAdha(Adhaar adha) {
this.adha = adha;
}
public Long getId() {
return id;
}
public void setId(Long id) {
this.id = id;
}
public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
public String getAddress() {
return address;
}
public void setAddress(String address) {
this.address = address;
}
public Person(String name, String address) {
super();
this.name = name;
this.address = address;
}
public Person() {
}
}
