package com.company;

public class Person {

    private String firstName;
    private String lastName;
    private String address;
    private String phoneNumber;
    private String email;

    public Person() {
        this.firstName = "";
        this.lastName = "";
        this.address = "";
        this.phoneNumber = "";
        this.email = "";
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



    public String toString() {
        String str;

        str = "First name  : " + firstName + ".\n" +
                "Lst name    : " + lastName + ".\n" +
                "Address     : " + address + ".\n" +
                "Phone number: " + phoneNumber + ".\n" +
                "Email       : " + email + ".\n";
        return str;
    }
}
