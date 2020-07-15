/*
package com.spring.reactive.application.controller;


import com.spring.reactive.application.data.entity.Account;
import com.spring.reactive.application.service.AccountService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.ArrayList;
import java.util.List;


@WebMvcTest(AccountController.class)
public class AccountControllerTest {


    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private AccountService accountService;


    @Test
    public void testGetAccounts() throws Exception {

        List<Account> accountList = new ArrayList<>();
        Account account = new Account();
        account.setId("123456");
        accountList.add(account);

        Mockito.when(accountService.findAll()).thenReturn(accountList);

        RequestBuilder requestBuilder = MockMvcRequestBuilders.
                get("/accounts")
                .accept(MediaType.APPLICATION_JSON);

        MvcResult result = mockMvc.perform(requestBuilder).andReturn();

       String response = result.getResponse().getContentAsString();

        Assertions.assertTrue(response.contains(account.getId()));

    }
}
*/
