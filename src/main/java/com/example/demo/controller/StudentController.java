package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.StudentServiceIMPL;

@RestController
@RequestMapping("/Student")
public class StudentController {

	@Autowired
	StudentServiceIMPL studentserviceImpl;
	
	//get all students
	@GetMapping("/allStudents")
	public List<Student> getAllStudent(){
		List<Student> list = studentserviceImpl.getAllStudent();
		return list;
	}
	
	//get student by StudentId
	@GetMapping("/getStudentById/{StudentId}")
	public Student getStudentById(@PathVariable("StudentId") int StudentId) {
		Student student = studentserviceImpl.getStudentById(StudentId);
		return student;
	}
	
	//insert Student in table
	@PostMapping("/saveStudent")
	public Student saveStudent(@RequestBody Student student) {
		Student saveStudent = studentserviceImpl.saveStudent(student);
		return saveStudent;
	}
	
	//delete student by StudentId
	@DeleteMapping("/Delete/{StudentId}")
	public void Delete(@PathVariable("StudentId") int StudentId) {
		studentserviceImpl.Delete(StudentId);
	}
	
	//Update Student Details
	@PutMapping("/updateStudent")
	public void updateStudent(@RequestBody Student student) {
		studentserviceImpl.updateStudent(student);
	}
	
}
