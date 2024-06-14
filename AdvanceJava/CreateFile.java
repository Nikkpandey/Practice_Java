package AdvanceJava;
import java.io.*;
public class CreateFile {
    public static void main(String[] args) throws IOException {
        DataInputStream fis=new DataInputStream(System.in);
        FileOutputStream fout=new FileOutputStream("myfile.txt");
        System.out.println("Enter the text (@ at the end): ");
        char ch;

        while((ch=(char)fis.read())!='@'){
            fout.write(ch);
        }
        fout.close();
    }
}
