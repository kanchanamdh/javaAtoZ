package com.company;

public class methodOvLoad {
    public static void main(String[] args) {

        // method overloding in java....

        int totalM1 = add(1,3);
        System.out.println(totalM1);

        int totalM2 = add(4,5, 5);
        System.out.println(totalM2);

        int totalM3 = add(1,3,4,8);
        System.out.println(totalM3);
    }



    static int add(int a , int b){   // method signature = parameters + method name

        System.out.println("This is overloded method #1");

        return a+b;

    }



    static int add(int a , int b , int c){

        System.out.println("This is overloded method #2");

        return a+b+c;
    }



    static int add(int a , int b , int c , int d){

        System.out.println("This is overloded method #3");

        return a+b+c+d;
    }

}
