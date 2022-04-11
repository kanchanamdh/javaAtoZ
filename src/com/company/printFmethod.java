package com.company;

public class printFmethod {
    public static void main(String[] args) {

        int age = 22;

        System.out.printf("Im  %d yeard old",age);  // format string using printf keyword....

        System.out.println();

        boolean isAdult = true;
        char myChar ='@';
        String name ="Kanchana";

        System.out.printf("%b", isAdult);

        System.out.println();

        System.out.printf("%c", myChar);

        System.out.println();

        System.out.printf("%s", name);

    }
}
