package com.oop_3;

public class Main_oop3 {

    public static void main(String[] args) {

        //Engine engine = new Engine("toyota", 50000);

        //Car mercedes = new Car("ToyotaCar", 2 , "Silver",engine)



        Car mercedes = new Car("ToyotaCar", 2 , "Silver", new Engine("toyota", 5000));


        System.out.println(mercedes.getName());

        System.out.println("Engine Model : "+ mercedes.getEngine().getModel());
    }
}
