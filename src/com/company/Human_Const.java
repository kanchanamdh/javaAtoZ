package com.company;

public class Human_Const {
    String name;
    int age ;
    double weight;

    Human_Const(String name , int age , double weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }


    void eat(){
        System.out.println(this.name + " is eating....");
    }

    void drink(){
        System.out.println(this.name+" is Drinking..");
    }
}
