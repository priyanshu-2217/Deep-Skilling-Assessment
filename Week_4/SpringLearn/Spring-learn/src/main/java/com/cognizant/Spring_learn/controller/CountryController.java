package com.cognizant.Spring_learn.controller;

import com.cognizant.Spring_learn.model.Country;
import com.cognizant.Spring_learn.service.CountryService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CountryController {

    private final CountryService countryService = new CountryService();

    @GetMapping("/countries")
    public List<Country> getAllCountries() {
        return countryService.getAllCountries();
    }

    @PostMapping("/countries")
    public Country addCountry(@Valid @RequestBody Country country) {
        return countryService.addCountry(country);
    }
}
