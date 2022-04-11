package com.fileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {

    public static void main(String[] args) throws IOException {


        File f = new File("new.txt");
        FileWriter fw1 = new FileWriter(f,true);


        FileWriter fw = new FileWriter("new1.txt",true  );

        fw.write("Java file handling....\n");
        fw.write("ABCD \n");
        fw.write("1234\n");
        fw.close();

        fw1.write("java file Handling......\n");
        fw1.write("java file handling...\n");
        fw1.close();

    }
}
