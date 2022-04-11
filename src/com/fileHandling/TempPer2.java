package com.fileHandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class TempPer2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fin = new FileInputStream("F:\\Kanchana\\java\\java A-Z part_1\\src\\com\\fileHandling\\carInfo.txt");
        ObjectInputStream objin = new ObjectInputStream(fin);
        ArrayList<Car> carread = new ArrayList<>();

        while (true){
            try{
                Car c = (Car) objin.readObject();
                carread.add(c);
            }catch (IOException | ClassNotFoundException e){
                break;
            }
        }
        System.out.println(carread);


    }
}
