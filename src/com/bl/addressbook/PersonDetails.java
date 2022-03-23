package com.bl.addressbook;

public class PersonDetails {
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private int zipCode;
    private String phoneNumber;
    private String email;

    public void Name(String firstName) {
        this.firstName = firstName;
    }

    public void LastName(String lastName) {
        this.lastName = lastName;
    }

    public void Address(String address) {
        this.address = address;
    }

    public void City(String city) {
        this.city = city;
    }

    public void State(String state) {
        this.state = state;
    }

    public void ZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public void PhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void Email(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "PersonDetails [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", city="
                + city + ", state=" + state + ", zipCode=" + zipCode + ", phoneNumber=" + phoneNumber + ", email=" + email
                + "]";
    }
}
