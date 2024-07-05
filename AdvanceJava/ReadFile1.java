package AdvanceJava;

//Reading a file using FileReader
import java.io.*;
public class ReadFile1 {
    public static void main(String[] args) throws IOException{
        //var
        int ch;

        // Check if file exist or not
        FileReader fr=null;
        BufferedReader br=null;

        //Check if file exist or not
        try{
            fr=new FileReader("text");
            br=new BufferedReader(fr,512);
        }
        catch (FileNotFoundException e){
            System.out.println("Not Found");
            return;
        }
        //read from file reader till the end of the file
        while((ch=br.read())!=-1){
            System.out.print((char)ch);
        }

        br.close();
        fr.close();
    }
}
