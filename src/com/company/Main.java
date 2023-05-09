package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int x = 7;

        Person p1 = new Person(1,"Tom");
        Person p2 = new Person();
        Person p3 = new Person(2);
        Person p4 = new Person("Marry");

        String s = "Hello world";

//        p1.printName();
//        p2.printName();
//        p3.printName();
//        p4.printName();

//        Person.printClassName(p1);

//        printSomething();
        int result = sum(4,5); // 9

//        System.out.println(result);

        Pet pet1 = new Pet("Tom",3,"grey");
        Dog dog1 = new Dog("Spike",4,"white");
        Cat cat1 = new Cat("Marry",6,"ginger");

//        Cat[] cats = {cat1,pet1};
//        Dog[] dogs = {dog1,pet1};
        Pet[] pets = {pet1,cat1,dog1};

        Scanner scanner = new Scanner(System.in);


        int[] arr = {1,2};
        try{
            exceptionHandle(4,0,arr,"abc");
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        //exceptionHandle(4,0,arr,"abc");





        //ArithmeticException
        //ArrayIndexOutOfBoundsException
    }

    public static void exceptionHandle(int a, int b, int[] arr, String s){
        System.out.println(a/b);
        System.out.println(arr[2]);
        System.out.println(s.charAt(3));
    }

    public static void printSomething(){
        System.out.println("something");
    }

    public static int sum(int a, int b){
        return a+b;
    }

    int sub(int a, int b){
        return a-b;
    }

    public static int mult(int a, int b){
        return a*b;
    }

    public static int div(int a, int b){
        return a/b;
    }
}
