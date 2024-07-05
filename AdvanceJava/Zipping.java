package AdvanceJava;
//Zipping the File Using Deflater OutputStream

import java.io.*;
import java.util.zip.*;
public class Zipping {
    public static void main(String[] args) throws Exception{
        //attach original file: file 1 to file input stream for reading data
        FileInputStream fin=new FileInputStream("file1.txt");

        //attach compressed file: file2 to file output stream
        FileOutputStream fos=new FileOutputStream("file2");

        //attach file input stream to DeflaterOutputStream
        DeflaterOutputStream dos=new DeflaterOutputStream(fos);

        //read data from file input stream and write it into deflater output stream
        int data;
        while((data=fin.read())!=-1){
            dos.write(data);
        }

        //close file
        fin.close();
        dos.close();
    }
}
