package com.example.herokutest.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.herokutest.model.Account;

@Repository
public interface AccountJpaRepository extends JpaRepository<Account, Long>{

}
