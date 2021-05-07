package com.example.herokutest.controller;

import com.example.herokutest.dao.ContactJpaRepository;
import com.example.herokutest.dao.AccountJpaRepository;
import com.example.herokutest.model.Account;
import com.example.herokutest.model.Contact;
import com.example.herokutest.service.ContactService;
import com.example.herokutest.service.AccountService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("errors")
public class RilevaErrore {

    String str1="";
    String str2="";
    String errorslist="";

    @Autowired
    private ContactService contactService;
    @Autowired
    private ContactJpaRepository repository;
    @Autowired
    private AccountService accountService;

    @GetMapping("/accounts")
    public Object getAccount(){
        List<Account> accounts = accountService.getAll();
        for (Account account: accounts) {
            str1= account.getName().toUpperCase();
            str2= account.getName();
            if (!str1.equals(str2)) { System.out.println("errore per account con id : "+account.getId()+" "+str2);
            errorslist="Error for account with id : "+account.getId()+" "+str2+"<br>"+errorslist; }
            }
        return errorslist;
        }


    @GetMapping("/contact")
    public Object getContact(){
        List<Contact> contacts = contactService.getAll();
        for (Contact contact: contacts) {
            str1=contact.getLastName().toUpperCase();
            str2=contact.getLastName();
            if (!str1.equals(str2)) { System.out.println("errore per contact con id : "+contact.getId()+" "+str2);
            errorslist="Error for contact with id : "+contact.getId()+" "+str2+"<br>"+errorslist; }
           }
        return errorslist;
        }
    }







