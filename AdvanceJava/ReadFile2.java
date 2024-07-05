package AdvanceJava;
//Reading Strings Using FileReader

import java.io.*;
public class ReadFile2 {
    public static void main(String[] args) throws IOException{
        String str;

        FileReader fr=new FileReader("stringsFile");
        BufferedReader br=new BufferedReader(fr);

        while((str=br.readLine())!=null){
            System.out.println(str);
        }
        br.close();
        fr.close();
    }
}
