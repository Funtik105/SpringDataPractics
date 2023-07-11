package com.example.dz2.models;

import java.math.BigDecimal;
import jakarta.persistence.*;

@Entity
@Table(name = "trucks")

public class Truck extends Vehicle {
    private static final String type = "Truck";
    @Column(name = "loadCapacity",length = 50, nullable = false)
    protected Double loadCapacity;
    public Truck(String model, BigDecimal price, String fuelype, Double loadCapacity) {
        super(type,model,price,fuelype);
        this.loadCapacity = loadCapacity;}

    protected Truck(){}
    public Double getloadCapacity() {return loadCapacity;}
    private void setLoadCapacity(String name) {this.loadCapacity = loadCapacity;}

    @Override
    public String toString() {
        return "Truck { loadCapacity=" + loadCapacity + ", type=" + type + ", model=" + model + ", price=" + price + ", fueltype=" + fueltypel + "}";
    }
}
