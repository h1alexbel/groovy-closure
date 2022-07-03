package com.h1alexbel.conditions;

public class Customer {

    private Long id;

    public Customer(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Customer{" +
               "id=" + id +
               '}';
    }
}