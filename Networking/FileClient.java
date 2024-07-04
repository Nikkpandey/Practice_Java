package Networking;

import java.io.*;
import java.net.*;
public class FileClient {
    public static void main(String[] args) throws IOException{
        Socket s=new Socket("localhost",778);

        //accept filename from the keyboard
        BufferedReader kb=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the file name: ");
        String fname=kb.readLine();

        //send file name to server
        DataOutputStream out=new DataOutputStream(s.getOutputStream());
        out.writeBytes(fname+"\n");

        //to read data from server
        BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));

        String str;

        //read first line from server into str
        str= br.readLine();

        if(str.equals("Yes")){
            while((str=br.readLine())!=null){
                System.out.println(str);
            }

            kb.close();
            out.close();
            br.close();
            s.close();
        }
        else
            System.out.println("Not Found");
    }
}
