package AdvanceJava;
//Unzipping file using InflaterInputStream

import java.io.*;
import java.util.zip.*;
public class UnZipping {
    public static void main(String[] args) throws Exception {

        //attach input file: file2 to FileInputStream for reading data
        FileInputStream fis = new FileInputStream("file2");

        //attach file: file3 to FileOutputStream for reading data
        FileOutputStream fos = new FileOutputStream("file3");

        //attach file output stream to Inflater Input stream for uncompressing the data
        InflaterInputStream iis = new InflaterInputStream(fis);

        //read data from InflaterInputStream and write it into FileOutputStream
        int data;
        while((data=iis.read())!=-1){
            fos.write(data);
        }

        //close the files
        fos.close();
        iis.close();
    }
}