package com.emma;

public class Person {
    
    private String name;
    private String lastName;
    private String idCard;
    private int birthYear;

    
    public Person (String name, String lastName, String idCard, int birthYear) {
        this.name = name;
        this.lastName = lastName;
        this.idCard = idCard;
        this.birthYear = birthYear;
    }
    
    public String toString() {
        return name + " " + lastName + " " + idCard + " " + birthYear;
    }
}

