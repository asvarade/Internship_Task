package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Student;

public interface StudentService {

	//get all students
	public List<Student> getAllStudent();
	
	//get student by StudentId
	public Student getStudentById(int StudentId);
	
	//insert Student in table
	public Student saveStudent(Student student);
	
	//delete student by StudentId
	public void Delete(int StudentId);
	
	//Update Student Details
	public void updateStudent(Student student);
	
	
}
