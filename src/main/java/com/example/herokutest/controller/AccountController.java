package com.example.herokutest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.herokutest.model.Account;
import com.example.herokutest.service.AccountService;

@RestController
public class AccountController {
	
	@Autowired
	private AccountService accountService;

	@GetMapping("/accounts")
	public ResponseEntity<List<Account>> getAccounts(){
		List<Account> accounts = accountService.getAll();
		return new ResponseEntity<List<Account>>(accounts, HttpStatus.OK);
	}
}
