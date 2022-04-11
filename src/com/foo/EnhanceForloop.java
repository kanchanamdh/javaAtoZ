package com.foo;

public class EnhanceForloop {
    public static void main(String[] args) {


        int  numbers[] ={2,3,4,45,5,100,75};



      //  Arrays.stream(numbers).forEach(System.out::println);




      for(int i =0; i < numbers.length ; i++){
          System.out.println(numbers[i]);
      }

      // Enhance for loop...



        System.out.println("Enhance for loop...");


      for(int number: numbers){
          System.out.println(number);
      }


        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }










        String names[] ={"Kanchana", "Mandra" , "Shalika"};



        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);

        }

        //Enhance forLoop...
        for (String name : names) {
            System.out.println(name);

        }

        for (int i = names.length - 1; i >= 0; i--) {
            System.out.println(names[i]);
        }


        for (String name : names) {

            if(name.startsWith("M")){
                continue;
            }
            System.out.println(name);
        }

    }
}
