package com.example.dz2.models;


import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "bikes")

public class Bike extends Vehicle{
    private final static String type = "Bike";

    public Bike(String model, BigDecimal price, String fueltype){
        super(type, model, price, fueltype);
    }
    protected Bike(){}

    @Override
    public String toString() {
        return "Bike { type=" + type + ", model=" + model + ", price=" + price + ", fueltype=" + fueltypel + "}";
    }
}
