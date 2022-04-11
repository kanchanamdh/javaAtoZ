package com.fileHandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class TempPer {
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        Scanner Sc = new Scanner(System.in);

        String model;
        int weight;
        int height;

        ArrayList<Car> cars = new ArrayList<>();

        for(int i=0; i<2 ; i++){

            System.out.println("Enter Car "+(i+1)+"Information");
            System.out.println("Weight :");

            weight = Sc.nextInt();

            System.out.println("height :");

            height= Sc.nextInt();

            System.out.println("model :");

            model=Sc.next();

            Car c1 = new Car(weight, height , model);

            cars.add(c1);


        }


        File file = new File("F:\\Kanchana\\java\\java A-Z part_1\\src\\com\\fileHandling\\carInfo.txt");
        FileOutputStream fout = new FileOutputStream(file, true);
        ObjectOutputStream objout = new ObjectOutputStream(fout);

        Iterator it = cars.iterator();

        while(it.hasNext()){
            Car carnew = (Car) it.next();

            objout.writeObject(carnew);
        }







    }
}
