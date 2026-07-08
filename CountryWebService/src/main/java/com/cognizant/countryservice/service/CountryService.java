package com.cognizant.countryservice.service;

import org.springframework.stereotype.Service;

import com.cognizant.countryservice.model.Country;

@Service
public class CountryService {

    public Country getCountry() {

        return new Country("IN", "India");

    }

}