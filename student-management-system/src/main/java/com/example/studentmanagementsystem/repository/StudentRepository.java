package com.example.studentmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.studentmanagementsystem.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

	//2 parameters type of the jpa entity and type of the primarykey
}