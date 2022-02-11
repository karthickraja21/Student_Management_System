package com.example.studentmanagementsystem.service.impl;
import com.example.studentmanagementsystem.service.StudentService;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.studentmanagementsystem.entity.Student;
import com.example.studentmanagementsystem.repository.StudentRepository;

import com.example.studentmanagementsystem.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{

	private StudentRepository studentRepository;
	//provide all the crud methods.
	
	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();       		 // provide list of students
	}

	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student);           //save the student details
	}

	@Override
	public Student getStudentById(Long id) {
		return studentRepository.findById(id).get();	  //Get student details
	}

	@Override
	public Student updateStudent(Student student) {
		return studentRepository.save(student);            //update Student details
	}

	@Override
	public void deleteStudentById(Long id) {
		studentRepository.deleteById(id);	               //delete Student details
	}

}