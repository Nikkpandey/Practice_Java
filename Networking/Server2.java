package Networking;
import java.io.*;
import java.net.*;
public class Server2 {
    public static void main(String[] args) throws IOException{

        //Create Server Socket
        ServerSocket ss=new ServerSocket(888);
        //connect it to client socket
        Socket s=ss.accept();
        System.out.println("Connection established");
        //to send data to client
        PrintStream ps=new PrintStream(s.getOutputStream());
        //to read data coming from client
        BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
        //to read data from the keyboard
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        //server execute continuously
        while(true){
            String str,str1;
            //repeat as long as client does not send null string
            while((str=br.readLine())!=null) //read from the client
            {
                System.out.println(str);
                str1=in.readLine();
                ps.println(str1);
            }

            //close connection
            ps.close();
            br.close();
            in.close();
            ss.close();
            s.close();
            System.exit(0);  //terminate application
        } //end of while

    }
}
