package com.company.Greenlee;

public class Contact {
    // Attributes
    public String name;
    public String email;

    // Default Constructor
    Contact(String name, String email){
        this.name = name;
        this.email = email;
    }

    // Setters
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    // Display() Method
    public void display() {
        System.out.print("Name: " + getName() + ", Email: " + getEmail() + "\n");
    }
}