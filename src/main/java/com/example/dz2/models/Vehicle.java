package com.example.dz2.models;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "Vehicle")
public abstract class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)

    @Column(name = "id")
    private Long id;
    @Column(name="type",length = 255,nullable = false)
    protected String type;
    @Column(name="model",length = 255,nullable = false)
    protected String model;
    @Column(name="price",length = 255,nullable = false)
    protected BigDecimal price;
    @Column(name="fueltype",length = 255,nullable = false)
    protected String fueltypel;

    protected Vehicle(String type,String model,BigDecimal price,String fueltypel){
        this.type=type;
        this.model=model;
        this.price=price;
        this.fueltypel=fueltypel;
    }
    protected Vehicle(){}
    public String getModel() {return model;}

}