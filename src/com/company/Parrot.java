package com.company;

public class Parrot extends Pet implements Flyable{


    public Parrot(String name, int age, String color) {
        super(name, age, color);
    }

    @Override
    public void fly(){
        System.out.println("This parrot can fly");
    }
}
