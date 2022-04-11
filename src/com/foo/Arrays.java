package com.foo;

import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

import java.util.ArrayList;

public class Arrays {
    public static void main(String[] args) {

        int zero = 0;
        int one = 1;

        int[] numbers = new int[3];

        numbers[0] = 0;
        numbers[1] = 1;
        numbers[2] = 3;

        System.out.println(numbers[1]);
        System.out.println(numbers[2]);




        // 1 way of create a array.....

        int [] numberList = {1,2,3,4,5};
        String [] names = {"Kanchana", "Nawam" , "Shalika", "Kaven", "Aravida"};

//names.for -->> crate for loop for array in short.



        //2 way of create a array.....


        int [] luckNumbers = new int[4];
        luckNumbers[0]=2;
        luckNumbers[1]=4;
        luckNumbers[2]=5;
        luckNumbers[3]=6;

        for (int luckNumber : luckNumbers) {
            System.out.println(luckNumber);
        }

        System.out.println();



        String[] cars = new String[5];
        cars[0]="Honda";
        cars[1]="Tesla";
        cars[3]="Toyota";
        cars[4]="Lanbogini";
        cars[0]="Mistubishi";

        for (int i = cars.length - 1; i >= 0; i--) {
            System.out.println(cars[i]);

        }


        System.out.println();






        // 3 way of create a array.....

        ArrayList<String> food = new ArrayList<String>();

        food.add("pizza");
        food.add("Humburger");
        food.add("hotDog");


        food.set(0,"sushi");
        food.remove(2);



        for (int i = 0; i < food.size(); i++) {
            System.out.println(food.get(i));

        }

        System.out.println();






    }

}
