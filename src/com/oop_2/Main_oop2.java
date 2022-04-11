package com.oop_2;

public class Main_oop2 {

    public static void main(String[] args) {

        Bird phoenix = new Bird("Nina ","Golden", 2 , true , 2);

        System.out.println(phoenix.getName());

        phoenix.eat("Meet");


        System.out.println(phoenix.getWings());

        phoenix.fly();

        phoenix.eat("Meet");
    }
}
