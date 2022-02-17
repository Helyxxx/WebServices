package com.example.restservice.model;

public class Address {
    private int number;
    private String street;
    private String postalCode;

    public Address() {
    }

    public Address(int number, String street, String postalCode) {
        this.number = number;
        this.street = street;
        this.postalCode = postalCode;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "number=" + number +
                ", street='" + street + '\'' +
                ", postalCode='" + postalCode + '\'' +
                '}';
    }
}