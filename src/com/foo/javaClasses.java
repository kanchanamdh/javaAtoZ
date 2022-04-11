package com.foo;

import java.time.LocalDate;

public class javaClasses {
    public static void main(String[] args) {

        // classes and objects




        Lens cannon_1 = new Lens("cannon_5545","85mm",true);  // cannon_1 is object of lense class

        System.out.println("cannon_1");
        System.out.println("Name of a cannon_1 lense : "+cannon_1.brand);
        System.out.println("focalLenght of a cannon_1 lense : "+cannon_1.focalLength);
        System.out.println("Is it including Prime Lense : "+cannon_1.isPrime);
        System.out.println();

        Lens cannon_2 = new Lens("cannon_1000", "50mm" , false);
        System.out.println();
        System.out.println("Name of a cannon_2 lense : "+cannon_2.brand);
        System.out.println("focalLenght of a cannon_2 lense : "+cannon_2.focalLength);
        System.out.println("Is it including Prime Lense : "+cannon_2.isPrime);
        System.out.println();








        Passport ukPassport= new Passport("212334", LocalDate.of(2022,2,21));
        Passport slPassport = new Passport("3432432",LocalDate.of(2021,2,12));

        System.out.println("passport Number : "+ukPassport.number);
        System.out.println("passport exPireDate  : "+ukPassport.expiryDate);

        System.out.println();


        System.out.println("passport Number : "+slPassport.number);
        System.out.println("passport exPireDate  : "+slPassport.expiryDate);






    }


    static class Lens{
        String brand ;
        String focalLength;
        boolean isPrime;

        Lens(String brand , String focalLength , boolean isPrime){  // Using constructers...
            this.brand = brand;
            this.focalLength=focalLength;
            this.isPrime= isPrime;
        }

    }

    static class Passport{
          String number ;
          LocalDate expiryDate;

          Passport(String number , LocalDate expiryDate){
              this.number = number;
              this.expiryDate =expiryDate;
          }
    }

}
