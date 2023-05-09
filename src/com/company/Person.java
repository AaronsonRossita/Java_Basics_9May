package com.company;

public class Person {

    int id;
    String name;
    private int age = 18;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Person() {
    }

    public Person(int id) {
        this.id = id;
    }

    public Person(String name) {
        this.name = name;
    }


    public void printName(){
        System.out.println("this person's name is " + this.name + " their age is " + this.age);
    }


    public static void printClassName(Person p){
        System.out.println("This class name is Person with default age " + p.age);
    }

}
