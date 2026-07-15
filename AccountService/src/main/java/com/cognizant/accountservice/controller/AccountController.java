package com.cognizant.accountservice.controller;

import org.springframework.web.bind.annotation.*;

import com.cognizant.accountservice.model.Account;

@RestController
@RequestMapping("/account")
public class AccountController {

    @GetMapping
    public Account getAccount() {

        return new Account(1001, "Brindha", 50000);

    }
}