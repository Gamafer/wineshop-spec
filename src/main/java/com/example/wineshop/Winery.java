package com.example.wineshop;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Winery {

    private @Id @GeneratedValue Integer id;
    private String name;

    public Winery(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
