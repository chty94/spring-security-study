package com.asianaidt.practice.springandvue.controller;


import com.asianaidt.practice.springandvue.account.Account;
import com.asianaidt.practice.springandvue.account.AccountRepository;
import com.asianaidt.practice.springandvue.account.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class AccountController {

    private final AccountRepository accountRepository;
    private final AccountService accountService;

    @GetMapping("/account/{role}/{username}/{password}")
    public Account createAccount(@ModelAttribute Account account) {
        return accountService.createNew(account);

    }


    @GetMapping("/account")
    public List<Account> findAll() {
        return accountRepository.findAll();
    }
}
