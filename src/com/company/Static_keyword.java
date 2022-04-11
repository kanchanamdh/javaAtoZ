package com.company;



public class Static_keyword {

    int x;
    static int y;

    void method_1(){
        System.out.println("Method without Static...");
    }

    static void method_2(){
        System.out.println("Method with Static....");
    }


    public static void main(String[] args) {

        //x=12; // cant assign values to  nonStatic variable in main method;
//
//        Static_keyword staticKeyword = new Static_keyword();  // have to create a object to call nonStatic varialbled & methods
//        staticKeyword.x=12;

        y=10; // can assign values to Static variable without getting error.




       // method_1();   // cant assign values to  nonStatic method  in main method;

        method_2();  // can assign values to Static methods  without getting error.



    }
}
