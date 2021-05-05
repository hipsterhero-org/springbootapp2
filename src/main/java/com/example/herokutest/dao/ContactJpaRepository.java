package com.example.herokutest.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.herokutest.model.Contact;

@Repository
public interface ContactJpaRepository extends JpaRepository<Contact, Long>{

}
