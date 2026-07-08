package com.cognizant.countryservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.countryservice.model.Country;
import com.cognizant.countryservice.service.CountryService;

@RestController
public class CountryController {

    @Autowired
    private CountryService service;

    @GetMapping("/country")
    public Country getCountry() {

        return service.getCountry();

    }

}   