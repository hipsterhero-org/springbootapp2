package com.example.herokutest.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.example.herokutest.dao.AccountJpaRepository;
import com.example.herokutest.model.Account;

@Service
public class AccountService {

	@Autowired
	private AccountJpaRepository accountRepo;
	
	@Transactional
	public List<Account> getAll() {
		return accountRepo.findAll(PageRequest.of(0, 50)).getContent();
	}
}
