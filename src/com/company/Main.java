package com.company;

import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {








        // OBJECT ORIENTED PROGRAMMING..........


        ////////////////////////////////////////////////////////////////////////////////////////////////

        //regards oop_class...........

        oop_Car myCar = new oop_Car();  // Creating new object of a oop_car class.........

       // System.out.println(myCar.brand);

        System.out.println();

        System.out.println(myCar.color);

        System.out.println();

       // System.out.println(myCar.model);

        System.out.println();

        myCar.brake();

        System.out.println();

        myCar.drive();

        System.out.println();//new comment for git test




        /////////////////////////////////////////////////////////////////////////////////////////////////////

        // regrads Human_Const calss...

        Human_Const human_1 = new Human_Const("Kanchana", 32, 45); // human_1 is object....

        Human_Const human_2 = new Human_Const("Nawam", 49,70);

        System.out.println("Name of Human 1"+human_1.name);
        System.out.println("Age of Human 1"+human_1.age);
        System.out.println("Weight of Human 1"+human_1.weight);

        System.out.println();


        System.out.println("Name of Human 2"+human_2.name);
        System.out.println("Age of Human 2"+human_2.age);
        System.out.println("Weight of Human 3"+human_2.weight);


        System.out.println();

        human_1.eat();   // calling method relavent to object...
        human_1.drink();

        System.out.println();

        human_2.eat();
        human_2.drink();


        System.out.println();
        System.out.println();






///////////////////////////////////////////////////////////////////////////////////////////////////////////////

// Arrays of object
//pass object as arguments in java













        //variable using premetive data types

        int myAge = 22;
        System.out.println(myAge);

        double myHeight = 10.5;
        System.out.println(myHeight);

        byte theByte = -128;
        short theShort = 8989;
        int theInt =333333333;
        long theLong= 78787878787L;


        float pi = 3.14F;
        double doublePi = 3.1423;

        boolean isLove =true;

        char nameInitial = 'A';









        //variable using reference data types

        String myName ="Kanchana";
        System.out.println(myName);




// or....
        String Name = new String("Kanchana Madhurnaga");

        System.out.println(Name.toUpperCase(Locale.ROOT));





        Date date = new Date();
        System.out.println(date);




        LocalDate toDay = LocalDate.now();
        System.out.println(toDay.atTime(12,30));



        System.out.println();
        System.out.println();




        Person friend_1 = new Person();

        friend_1.name = "Aravinda";
        friend_1.age = 22;
        friend_1.town ="Galle";



        System.out.println(friend_1.name);
        System.out.println(friend_1.age);
        System.out.println(friend_1.town);


        //   System.out.println(friend_2.name);
        //   System.out.println(friend_3.name);




Friend friend1 = new Friend("Nawam", 21, "Galle");


        System.out.println(friend1.friendName);
        System.out.println(friend1.friendAge);
        System.out.println(friend1.frinedTown);





    }









    static class Person {
        String name;
        int age;
        String town;

        Person(){

        }
    }





    static class Friend{
        String friendName;
        int friendAge;
        String frinedTown;

        Friend(String fname,int fage, String ftown ){
            this.friendName=fname;
            this.friendAge=fage;
            this.frinedTown=ftown;

        }



    }

}
