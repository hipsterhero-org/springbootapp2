package com.example.herokutest.service;
import com.example.herokutest.dao.ContactJpaRepository;
import com.example.herokutest.model.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ContactService {

    @Autowired
    private ContactJpaRepository ContactRepo;

    @Transactional
    public List<Contact> getAll() {
        return ContactRepo.findAll();
    }
}


