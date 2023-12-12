package com.example.demo.model;

import jakarta.persistence.*;

@Entity
public class HomeAddress {

    public HomeAddress (){

    }

    public HomeAddress(String streetName, int zipCode) {
        this.streetName = streetName;
        this.zipCode = zipCode;
    }



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="HomeAddressId")
    private Integer id;

    @Column(name="StreetName")
    private String streetName;

    @Column(name="ZipCode")
    private int zipCode;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    @Override
    public String toString() {
        return "HomeAddress{" +
                "id=" + id +
                ", streetName='" + streetName + '\'' +
                ", zipCode=" + zipCode +
                '}';
    }
}