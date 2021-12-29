package com.codedifferently.labs.lab03a.examples.example01_employees;

public class Employee {
    private String name;
    private double rating;

    public Employee() {
        this.name = "Not Set";
        this.rating = 0.0;
    }

    public Employee(String name, double rating) {
        this.name = name;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", rating=" + rating +
                '}';
    }
}
