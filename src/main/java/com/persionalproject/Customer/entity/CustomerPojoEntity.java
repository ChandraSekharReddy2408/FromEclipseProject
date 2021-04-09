package com.persionalproject.Customer.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class CustomerPojoEntity 
{
	@Id
	@GeneratedValue
private Integer id;
private String name;
private Integer Age;
private Integer marks;
private Date joingdate;
private String email;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Integer getAge() {
	return Age;
}
public void setAge(Integer age) {
	Age = age;
}
public Integer getMarks() {
	return marks;
}
public void setMarks(Integer marks) {
	this.marks = marks;
}
public Date getJoingdate() {
	return joingdate;
}
public void setJoingdate(Date joingdate) {
	this.joingdate = joingdate;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}


}
