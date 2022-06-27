package com.kenneth.BankApp.Entities;


import org.springframework.context.annotation.ComponentScan;

import javax.persistence.*;

@Entity
@Table(name = "address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "address_id")
    private Integer addressId;
    @Column
    private String street;
    @Column(name = "street_number")
    private Integer streetNumber;
    @Column
    private String state;
    @Column
    private String city;
    @Column
    private String zipcode;

    @OneToOne(fetch = FetchType.LAZY)
    private User user;

    public Address() {
    }

    public Address(String street, Integer streetNumber, String state, String city, String zipcode, User user) {
        this.street = street;
        this.streetNumber = streetNumber;
        this.state = state;
        this.city = city;
        this.zipcode = zipcode;
        this.user = user;
    }

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Integer getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(Integer streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Address{" +
                "addressId=" + addressId +
                ", street='" + street + '\'' +
                ", streetNumber=" + streetNumber +
                ", state='" + state + '\'' +
                ", city='" + city + '\'' +
                ", zipcode='" + zipcode + '\'' +
                ", user=" + user +
                '}';
    }
}
