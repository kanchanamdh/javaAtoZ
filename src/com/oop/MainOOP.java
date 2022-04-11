package com.oop;

public class MainOOP {


    // todo:    CONSTRUTORS & ENCAPSULATION....


    public static void main(String[] args) {

        Phone iphone = new Phone("iPhone 11",5,8,3);

       // todo:    iphone.setName("iPhone 11");

        System.out.println(iphone.getName());

       // todo:   iphone.setMemoryRam(8);

        iphone.playMusic("Our Wings are Burning");
        iphone.playMusic("Laminting Kiss");


        Phone phone = new Phone ("Pixel_3",16);


    }
}
