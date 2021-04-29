package com.example.herokutest.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.herokutest.dao.StudentJpaRepository;
import com.example.herokutest.model.Student;

@Service
public class StudentService {

	@Autowired
	private StudentJpaRepository studentRepo;
	
	@Transactional
	public List<Student> getAll() {
		return studentRepo.findAll();
	}
}
