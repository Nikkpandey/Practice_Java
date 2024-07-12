package ThreadPractice;
//WAP to create a server with 2 threads to communicate with several Clients

import java.io.*;
import java.net.*;
public class MultiServer implements Runnable {
    static ServerSocket ss;
    static Socket s;

    public void run(){
        String name=Thread.currentThread().getName();

        for( ; ; ){
            try{
                System.out.println("Thread "+name+ "ready to accept......");
                s=ss.accept();
                System.out.println("Thread "+name+" accepted the connection");

                //for sending message
                PrintStream ps=new PrintStream(s.getOutputStream());
                ps.println("Thread "+name+" contacted you");

                ps.close();
                s.close();

                //do not close ServerSocket
            }
            catch(Exception e){}
        }
    }

    public static void main(String[] args) throws Exception{
        MultiServer ms=new MultiServer();

        //Create server socket with 999 as port number
        ss=new ServerSocket(999);

        Thread t1=new Thread(ms,"One");
        Thread t2=new Thread(ms,"Two");

        t1.start();
        t2.start();
    }
}
