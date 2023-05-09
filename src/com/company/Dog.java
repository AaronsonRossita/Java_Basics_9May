package com.company;

public class Dog extends Pet{


    public Dog(String name, int age, String color) {
        super(name, age, color);
    }

    public void dogSpeak(){
        System.out.println("woof");
    }

}
