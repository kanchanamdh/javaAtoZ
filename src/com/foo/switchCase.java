package com.foo;

public class switchCase {
    public static void main(String[] args) {

        String gender = "FEMAIL";

        switch(gender){

            case "FEMAIL":
                System.out.println("I am a person..");
                break;
            case "MALE":
                System.out.println("I am a women...");
                break;
            case "PREFER_NOT_SAY":
                System.out.println("I dont like to say gender...");
                break;
            default:
                System.out.println("This is a default statement....");

        }
    }
}
