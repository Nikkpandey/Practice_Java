package AdvanceJava;
import java.io.*;
public class CreateFile {
    public static void main(String args[]) throws IOException{

        //Attach keyboard to input stream
        DataInputStream dis=new DataInputStream(System.in);

        //Attach file where data stored
        FileOutputStream fos=new FileOutputStream("myfile.txt",true);

        // for improving performance
        BufferedOutputStream bos=new BufferedOutputStream(fos,1024);

        System.out.println("Enter the text (@ at the end): ");
        char ch;
        // Read data from DataInputStream and write it into BufferedReader
        while((ch=(char)dis.read())!='@'){
            bos.write(ch);
        }

        bos.close();
    }
}
