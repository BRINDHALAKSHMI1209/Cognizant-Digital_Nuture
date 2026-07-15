package com.cognizant.loanservice.controller;

import org.springframework.web.bind.annotation.*;

import com.cognizant.loanservice.model.Loan;

@RestController
@RequestMapping("/loan")
public class LoanController {

    @GetMapping
    public Loan getLoan() {

        return new Loan(501, "Home Loan", 2500000);

    }
}