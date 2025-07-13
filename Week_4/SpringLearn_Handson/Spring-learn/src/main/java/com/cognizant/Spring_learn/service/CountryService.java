package com.cognizant.Spring_learn.service;

import com.cognizant.Spring_learn.dao.CountryDao;
import com.cognizant.Spring_learn.model.Country;

import java.util.ArrayList;
import java.util.List;

public class CountryService {
    private final CountryDao countryDao = new CountryDao();

    public List<Country> getAllCountries() {
        return countryDao.getAllCountries();
    }

    public Country addCountry(Country country) {
        List<Country> countries = countryDao.getAllCountries();
        countries.add(country); // this will persist only in-memory (since we use XML)
        return country;
    }
}
