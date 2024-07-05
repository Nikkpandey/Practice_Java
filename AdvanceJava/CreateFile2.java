package AdvanceJava;

// Storing Strings into a file using FileWriter
import java.io.*;
public class CreateFile2 {
    public static void main(String[] args) throws IOException{
        //Read strings from keyboard
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        String str;

        //open file for writing
        FileWriter fw=new FileWriter("stringsFile");

        //read string and store in the file till exit typed
        System.out.println("Enter data: ");

        while(!(str=br.readLine()).equals("exit")){
            fw.write(str+"\n");
        }

        fw.close();
    }
}
