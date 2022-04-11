package com.company;

public class oop_Car {
    private String brand;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }




    int year = 2020;
    String color = "blue";
    double price = 5000.00;


    static void drive(){
        System.out.println("You driving car....");
    }

    static void brake(){
        System.out.println(" Put your step on the break ...");
    }

}
