package com.oop_2;

public class Bird extends Dog {



    private int wings;

    @Override

    public void eat(String food){

       super.eat(food);  // eat mwthod of dog class ...call with super keyword

        System.out.println("Eating finished");
    }


    public void fly(){
        System.out.println(this.getName()+"is flying");
    }


    public int getWings() {

        return wings;
    }

    public void setWings(int wings) {

        this.wings = wings;
    }

    public Bird(String name, String color, int legs, boolean hasTale , int wings) {
        super(name, color, legs, hasTale);

        this.wings = wings;  //  addtion to the Dog class members...
    }



    Bird phoenix = new Bird("Nina ","Golden", 2 , true , 2);
}


















//
//    private String name;
//    private String color;
//    private int legs;
//    private boolean hasTale;
//
//    public Bird(String name, String color, int legs, boolean hasTale) {
//        this.name = name;
//        this.color = color;
//        this.legs = legs;
//        this.hasTale = hasTale;
//    }
//
//    public void eat (String food){
//        System.out.println("Eating "+ food);
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getColor() {
//        return color;
//    }
//
//    public void setColor(String color) {
//        this.color = color;
//    }
//
//    public int getLegs() {
//        return legs;
//    }
//
//    public void setLegs(int legs) {
//        this.legs = legs;
//    }
//
//    public boolean isHasTale() {
//        return hasTale;
//    }
//
//    public void setHasTale(boolean hasTale) {
//        this.hasTale = hasTale;
//    }