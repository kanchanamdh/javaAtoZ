package com.company;

import java.util.Locale;

public class MethodsOfString {
    public static void main(String[] args) {

        String name = "Kanchana";

        boolean result = name.equals("Kanchana");

        System.out.println(result);

        boolean resultN = name.equals("Mashuranaga");

        System.out.println("Method of equal : "+resultN);

        int resultL = name.length();

        System.out.println("Method of length : "+resultL);

        int resultI = name.indexOf("h");

        System.out.println("Method of indexOf: "+resultI);

        String resultU = name.toUpperCase(Locale.ROOT);

        System.out.println("Method of toUpperCase : "+resultU);

        String resultTr = name.trim();

        System.out.println("Method of Trim : "+resultTr);

        String resultRep = name.replace('c','b');

        System.out.println("Method of replce : "+resultRep);


    }
}
