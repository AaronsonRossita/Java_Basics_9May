package com.company;

public class Cat extends Pet{


    public Cat(String name, int age, String color) {
        super(name, age, color);
    }

    public void catSpeak(){
        System.out.println("meow");
    }

}
