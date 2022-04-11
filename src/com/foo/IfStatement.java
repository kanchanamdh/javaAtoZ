package com.foo;

public class IfStatement {
    public static void main(String[] args) {

        int age = 22;

        if( age >= 18){
            System.out.println("Couldnt issue liqurs..!");

        }else if (age >= 16 && age < 18){
            System.out.println("only beer...");

        }else{
            System.out.println("Can issue any of liqure..");
        }


    }
}
