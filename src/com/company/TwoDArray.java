package com.company;

public class TwoDArray {
    public static void main(String[] args) {


        String[][] cars = new String[3][3];

        cars[0][0]="Axio";
        cars[0][1]="suv";
        cars[0][2]="Honda";
        cars[1][0]="lambogini";
        cars[1][1]="Defender";
        cars[1][2]="KIA";
        cars[2][0]="Toyota";
        cars[2][1]="VaganR";
        cars[2][2]="Caravan";


        //or string[][] cars ={{"Axio", "Suv", "Honda"}, {lambogini, Defender, KIA} , {},....}

        for (int i = 0; i < cars.length; i++) {
            System.out.println();
            for (int j = 0; j < cars.length; j++) {
                System.out.println(cars[i][j]);
            }

        }



        //bro code example....





    }
}
