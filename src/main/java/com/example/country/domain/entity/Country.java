package com.example.country.domain.entity;

import java.util.Date;

public class Country {
    private String code;
    private String name;

    public Country() {}

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
}