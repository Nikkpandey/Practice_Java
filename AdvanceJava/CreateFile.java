package AdvanceJava;
import java.io.*;
public class CreateFile {
    public static void main(String args[]) throws IOException{
        DataInputStream dis=new DataInputStream(System.in);
        FileOutputStream fos=new FileOutputStream("myfile.txt",true);
        BufferedOutputStream bos=new BufferedOutputStream(fos,1024);
        System.out.println("Enter the text (@ at the end): ");
        char ch;

        while((ch=(char)dis.read())!='@'){
            bos.write(ch);
        }

        bos.close();
    }
}
