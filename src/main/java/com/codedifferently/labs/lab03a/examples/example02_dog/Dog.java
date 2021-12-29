package com.codedifferently.labs.lab03a.examples.example02_dog;

public class Dog {
    private int weight;
    private int loudness;
    private String barkNoise;

    public Dog() {
        this.weight = 12;

        this.barkNoise = "Woof!";
    }

    public Dog(int weight, int loudness) {
        this.weight = weight;

        this.loudness = loudness;
        this.barkNoise = "ARF!";
    }

    public Dog(int weight, int loudness, String barkNoise) {
        this.weight = weight;
        this.loudness = loudness;
        this.barkNoise = barkNoise;
    }

    public void bark(String b){
        System.out.println(b);
    }

    public void bark(){
        System.out.println(barkNoise);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "weight=" + weight +
                ", loudness=" + loudness +
                ", barkNoise='" + barkNoise + '\'' +
                '}';
    }
}
