package ThreadPractice;

//WAP for the client receiving the messages from the server above
import java.io.*;
import java.net.*;
public class MultiClient {
    public static void main(String[] args) throws Exception{
        //Create Client Socket with port number 999
        Socket s=new Socket("localhost",999);

        //to accept data from server
        BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));

        //receive data as long as server does not close client socket
        String str;
        while((str=br.readLine())!=null)
            System.out.println(str);

        br.close();
        s.close();
    }
}
