package com.cognizant.Spring_learn.model;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Country {
    @NotNull(message = "Code cannot be null")
    @Size(min = 2, max = 2, message = "Code should be 2 characters")
    private String code;

    @NotNull(message = "Name cannot be null")
    @Size(min = 1, max = 50, message = "Name should be between 1 to 50 characters")
    private String name;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Country{code='" + code + "', name='" + name + "'}";
    }
}
