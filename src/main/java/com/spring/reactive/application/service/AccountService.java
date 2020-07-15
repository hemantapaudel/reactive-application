package com.spring.reactive.application.service;


import com.spring.reactive.application.data.entity.Account;

import java.util.List;

public interface AccountService {

    Account create(Account account);

    void createAccounts() throws RuntimeException;

    void delete(String id);

    List<Account> findAll() throws Exception;

    List<Account> findAllAccounts() throws Exception;

    Account findById(String id);

    Account update(Account todo);
}