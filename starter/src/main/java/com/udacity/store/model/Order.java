package com.udacity.store.model;

import javax.persistence.*;

@Entity
@Table(name = "orders")

public class Order {
    //TODO: Add the details of the order class
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private double price;


    public Order(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Order() {
    }

    public String getName() {
        return name;
    }

}
