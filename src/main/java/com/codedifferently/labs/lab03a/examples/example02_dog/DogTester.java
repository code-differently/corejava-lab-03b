package com.codedifferently.labs.lab03a.examples.example02_dog;

public class DogTester {
    public static void main(String[] args) {
        Dog biscuit = new Dog();
        System.out.println(biscuit);
        biscuit.bark();

        Dog scoobie = new Dog(10, 5);
        System.out.println(scoobie);
        scoobie.bark();
        
        Dog snoop = new Dog(10,5,"Biznark");
        System.out.println(snoop);
        snoop.bark();
    }
}
