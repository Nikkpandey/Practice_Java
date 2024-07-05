package AdvanceJava;

//Creating File Using FileWriter

import java.io.*;
public class CreateFile1 {
    public static void main(String[] args) throws IOException{
        //Take a string
        String str="This is a Java Program."+"\nProgram For creating the file using file writer";

        //attach file to file writer
        FileWriter fw=new FileWriter("text");

        //for improving the speed using BufferedWriter
        BufferedWriter bw=new BufferedWriter(fw,1024);

        //read char wise from the string and write into filewriter
        for(int i=0; i<str.length(); i++){
            bw.write(str.charAt(i));
        }

        System.out.println("File created");
        bw.close();
        fw.close();
    }
}
