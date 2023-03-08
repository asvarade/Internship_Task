package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.StudentRepo;
import com.example.demo.model.Student;

@Service
public class StudentServiceIMPL implements StudentService{

	@Autowired
	StudentRepo studentRepo;

	@Override
	public List<Student> getAllStudent() {
		List <Student> list = new ArrayList(); 
		studentRepo.findAll().forEach(a -> list.add(a));
		return list;
	}

	@Override
	public Student getStudentById(int StudentId) {
		Student student =studentRepo.findById(StudentId).get();
		return student;
	}

	@Override
	public Student saveStudent(Student student) {
		Student saveStudent = studentRepo.save(student);
		return saveStudent;
	}

	@Override
	public void Delete(int StudentId) {
        studentRepo.deleteById(StudentId);		
	}

	@Override
	public void updateStudent(Student student) {
		studentRepo.save(student);
	}
	
}
