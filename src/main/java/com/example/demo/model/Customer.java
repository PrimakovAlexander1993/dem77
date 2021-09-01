package com.example.demo.model;

import javax.persistence.Entity;

@Entity
public class Customer {
    private int x;


    public Customer(int x) {
        this.x = x;
    }
}
