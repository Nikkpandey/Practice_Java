package Networking;
import java.net.*;
import java.io.*;

public class Server1 {
    public static void main(String[] args) throws IOException{
        ServerSocket ss=new ServerSocket(777);
        Socket s=ss.accept();
        OutputStream obj=s.getOutputStream();
        PrintStream ps=new PrintStream(obj);
        String str="Hello Client";
        ps.println(str);
        ps.print("Bye");

        ss.close();
        s.close();
        ps.close();

    }
}
