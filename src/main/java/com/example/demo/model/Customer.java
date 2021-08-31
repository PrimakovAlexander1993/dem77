package com.example.demo.model;

import javax.persistence.Entity;

@Entity
public class Customer {
    private int x;
    String name;
    double b;

    public Customer(int x, String name, double b) {
        this.x = x;
        this.name = name;
        this.b = b;
    }
}
