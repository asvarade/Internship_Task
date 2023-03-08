package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int StudentId;
	
	@Column(name="FisrtName")
	private String FirstName;
	
	@Column(name="LastName")
    private String LastName;
	
	@Column(name="City")
	private String City;
	
	@Column(name="Age")
	private int Age;
	
	public int getStudentId() {
		return StudentId;
	}
	public void setStudentId(int studentId) {
		StudentId = studentId;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	@Override
	public String toString() {
		return "Student [StudentId=" + StudentId + ", FirstName=" + FirstName + ", LastName=" + LastName + ", City="
				+ City + ", Age=" + Age + "]";
	}
	public Student() {
		super();
	}
	public Student(int studentId, String firstName, String lastName, String city, int age) {
		super();
		StudentId = studentId;
		FirstName = firstName;
		LastName = lastName;
		City = city;
		Age = age;
	}
	
	 
	
}
