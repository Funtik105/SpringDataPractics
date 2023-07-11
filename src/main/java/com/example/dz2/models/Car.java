package com.example.dz2.models;

import jakarta.persistence.*;
import java.math.BigDecimal;


@Entity
@Table(name = "cars")


public class Car extends Vehicle{
    private final static String type ="Car";
    @Column(name="seats",length = 50, nullable = false)
    private Integer seats;
    public int getSeats() {return seats;}
    public Car(String model, BigDecimal price, String fueltype, Integer seats) {
        super(type, model, price, fueltype);
        this.seats = seats;
    }
    protected Car(){}

    @Override
    public String toString() {
        return "Car { seats=" + seats + ", type=" + type + ", model=" + model + ", price=" + price + ", fueltype=" + fueltypel + "}";
    }

}
