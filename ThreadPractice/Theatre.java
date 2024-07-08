package ThreadPractice;
import java.lang.*;
// WAP to show two threads working simultaneously
public class Theatre {
    public static void main(String[] args) {
        MyThread3 obj1=new MyThread3("Cut the ticket");
        MyThread3 obj2=new MyThread3("Show the seat");

        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);

        t1.start();
        t2.start();
    }
}


class MyThread3 implements Runnable{

    //declare string to show the task
    String str;

    MyThread3(String str){
        this.str=str;
    }

    public void run(){
        for(int i=0; i<=10; i++){
            System.out.println(str+" : "+i);

            try{
                //cease thread execution for 2000 millisecond
                Thread.sleep(2000);
            }
            catch(InterruptedException ie){
                ie.printStackTrace();
            }
        }
    }
}
