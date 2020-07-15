package com.spring.reactive.application.data.repos;


import com.spring.reactive.application.data.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, String> {

}


