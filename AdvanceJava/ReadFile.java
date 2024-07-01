package AdvanceJava;
import java.io.*;
public class ReadFile {
    public static void main(String[] args) throws IOException {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the file name: ");
        String fname=br.readLine();

        FileInputStream fis=null;
        try{
            fis=new FileInputStream(fname);
        }
        catch(Exception e){
            System.out.println("File not found");
            return;
        }

        BufferedInputStream bin=new BufferedInputStream(fis);
        System.out.println("File contents: ");

        int ch;
        while((ch=bin.read())!=-1){
            System.out.print((char)ch);
        }

        bin.close();
    }
}
