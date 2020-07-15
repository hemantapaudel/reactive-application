package com.spring.reactive.application.controller;

import com.spring.reactive.application.data.entity.Account;
import com.spring.reactive.application.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AccountController {

    @Autowired
    AccountService accountService;

    @GetMapping(value = "/accounts", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Account> getAccounts() throws Exception {

       return accountService.findAll();

    }
}
