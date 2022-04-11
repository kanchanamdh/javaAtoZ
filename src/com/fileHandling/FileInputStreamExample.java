package com.fileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamExample {

    public static void main(String[] args) throws IOException {

        File f = new File("new1.txt");
        FileOutputStream fout  = new FileOutputStream(f);
        fout.write(65); // writing Byte Ascii 65=A
        fout.write(66); // ascii 66=B

        System.out.println("Succes of byte writting ");

        String s= "\n OOP Programing";
        byte b[]=s.getBytes();
        fout.write(b);
        System.out.println("Success of String writing");



    }
}
