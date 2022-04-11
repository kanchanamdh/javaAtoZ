package com.foo;

import java.time.LocalDate;  // import statements....
import java.time.LocalDateTime;
import java.util.Date;

public class Foo {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);


        LocalDateTime localdatetime = LocalDateTime.now();
        System.out.println(localdatetime);


    }
}
