package com.example.demo.model;

import javax.persistence.Entity;

@Entity
public class Customer {
    private int x;
    String name ;

    public Customer(int x, String name) {
        this.x = x;
        this.name = name;
    }
}
