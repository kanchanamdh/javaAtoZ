package com.foo;

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {

        Scanner inputData = new Scanner(System.in);

        System.out.print("Enter your name :");
        String name = inputData.nextLine();


        System.out.print("Enter your age here :");
        int Age = inputData.nextInt();


        System.out.print("Enter your town :");
        String Town = inputData.nextLine();



        System.out.println("Thank you "+ name +"Come again");







    }
}
