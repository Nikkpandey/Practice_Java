package ThreadPractice;
import java.lang.*;
import java.io.*;
public class Demo1{
        public static void main(String[] args) throws IOException{
            MyThread obj=new MyThread();

            Thread t=new Thread(obj);

            t.start();

            System.in.read();   //wait till press enter
            obj.stop=true;
        }
    }

class MyThread extends Thread{
    boolean stop=false;
    public void run(){
        for(int i=1; i<=10000000; i++){
            System.out.println(i);
            if(stop)               //come out of the run
                return;
        }
    }
}
