package com.example.herokutest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.herokutest.model.Student;
import com.example.herokutest.service.StudentService;

@RestController
public class TestController {

	@Autowired
	private StudentService studentService;
	
	@GetMapping("/test")
	public ResponseEntity<List<Student>> test() {
		List<Student> list = studentService.getAll();
		return new ResponseEntity<List<Student>>(list, HttpStatus.OK);
	}
}
