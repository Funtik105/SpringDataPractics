package com.example.dz2.models;

import java.math.BigDecimal;
import jakarta.persistence.*;

@Entity
@Table(name = "planes")

public class Plane extends Vehicle{
    private final static String type = "Plane";
    @Column(name = "airline",length = 50, nullable = false)
    private String airline;
    @Column(name = "passengerCapacity",length = 50, nullable = false)
    private int passengerCapacity;
    public int getPassengerCapacity() {return passengerCapacity;}
    public void setPassengerCapacity(int passengerCapacity) {this.passengerCapacity = passengerCapacity;}
    protected Plane(){}
    public Plane(String model, BigDecimal price, String fueltype, String airline, int passengerCapacity) {
        super(type,model,price,fueltype);
        this.airline=airline;
        this.passengerCapacity = passengerCapacity;}

    public int getpassengercapacity() {return passengerCapacity;}

    @Override
    public String toString() {
        return "Plane { airline=" + airline + ", passengerCapacity=" + passengerCapacity + ", type=" + type + ", model=" + model + ", price=" + price + ", fueltype=" + fueltypel + "}";
    }
}
