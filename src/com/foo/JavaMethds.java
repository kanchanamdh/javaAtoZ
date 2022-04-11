package com.foo;

import java.util.Scanner;

public class JavaMethds {
    public static void main(String[] args) {  // main method.....


    char [] letters ={'S','F', 'D', 'T','D'};

    //String [] names = {};

    // call method countOccerences
    int count = countOccrrences(letters,'Y');
    System.out.println(count);



    // call method hello
        hello();

        System.out.println();

    // call method add

      //  System.out.println( add(6,5));

        //or....


        int totalOfNUm =  add(6,5);

        System.out.println(totalOfNUm);


        System.out.println();

    }








//method -> non return type

    static void hello(){

        Scanner getName = new Scanner(System.in);

        System.out.print("Enter your name :");

        String name = getName.next();

        System.out.println("Hello..!"+ name);
    }



// method -> return type -> int

    public static int countOccrrences(char [] letters , char searchLetter){
        System.out.println(searchLetter);
    int count =0;
        for (char letter : letters) {
            if (letter == searchLetter){
                count++;
            }
        }

        return count;
    }


    static int add(int x , int y){

        int total = x+y;
        return total;
    }












}
