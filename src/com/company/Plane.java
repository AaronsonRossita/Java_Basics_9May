package com.company;

public class Plane extends Vehicle implements Flyable{

    public Plane(int wheels, String engine) {
        super(wheels, engine);
    }

    @Override
    public void fly() {
        System.out.println("This plane could fly");
    }
}
