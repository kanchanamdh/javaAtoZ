package com.fileHandling;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.io.FileInputStream;
import java.io.IOException;

public class FileOutputStreamExample {

    public static void main(String[] args) throws IOException {


        FileInputStream fin = new FileInputStream("new2.txt");

        int i = fin.read();
        System.out.println(i);
        System.out.println((char)i);


    }

}
