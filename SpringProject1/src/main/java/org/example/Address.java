package org.example;

public class Address {
    private String city;
    private String state;
    private String country;
    private String zipcode;

    public Address(String city, String state, String country, String zipcode) {
        this.city = city;
        this.state = state;
        this.country = country;
        this.zipcode = zipcode;
    }

    public String toString(){
        return "Address: " + city + ", " + state + ", "  + country + ", " + zipcode;
    }
}
