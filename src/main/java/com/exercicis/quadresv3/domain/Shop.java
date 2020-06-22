package com.exercicis.quadresv3.domain;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="Shop")
public class Shop {
    @Id
    //@GeneratedValue(strategy = GenerationType.SEQUENCE)
    @GeneratedValue(strategy= GenerationType.AUTO,generator="native")
    @GenericGenerator(name = "native",strategy = "native")
    private int id;
    private String name;
    private Integer capacity;

    public Shop(){
    }

    public Shop(String name, Integer capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }
}
