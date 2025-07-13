package com.cognizant.JWT_Handson.Controller;

import com.cognizant.JWT_Handson.model.Country;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class CountryController {

    @GetMapping("/countries")
    public List<Country> getAllCountries() {
        return List.of(
                new Country("IN", "India"),
                new Country("US", "United States")
        );
    }
}
