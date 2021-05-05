package com.example.herokutest.controller;

import java.util.List;

import com.example.herokutest.model.Account;
import com.example.herokutest.model.Contact;
import com.example.herokutest.service.AccountService;
import com.example.herokutest.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.herokutest.model.Student;
import com.example.herokutest.service.StudentService;
import com.example.herokutest.model.Contact;



@RestController
public class TestController {

	@Autowired
	private StudentService studentService;

	@Autowired
	private AccountService accountService;

	@Autowired
	private ContactService contactService;
	
	@GetMapping("/test")
	public ResponseEntity<List<Student>> test() {
		List<Student> list = studentService.getAll();
		return new ResponseEntity<List<Student>>(list, HttpStatus.OK);
	}
	@GetMapping("/test1")
	public ResponseEntity<List<Student>> test1() {
		List<Student> list = studentService.getAll();
		return new ResponseEntity<List<Student>>(list, HttpStatus.OK);
	}
	@GetMapping("/accounts2")
	public ResponseEntity<List<Account>> getAccounts2(){
		List<Account> accounts = accountService.getAll();
		return new ResponseEntity<List<Account>>(accounts, HttpStatus.OK);
	}
	@GetMapping("/contact")
	public ResponseEntity<List<Contact>> getContact(){
		List<Contact> contacts = contactService.getAll();
		return new ResponseEntity<List<Contact>>(contacts, HttpStatus.OK);
	}
}