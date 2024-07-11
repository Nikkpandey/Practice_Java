package ThreadPractice;

import java.io.IOException;

//WAP for communication between threads
public class ThreadComm {
    public static void main(String[] args) throws IOException {
        Producer obj1=new Producer();
        Consumer obj2=new Consumer(obj1);

        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);

        t2.start(); //consumer waits
        t1.start();  //producer starts production
    }
}

class Producer extends Thread{
    StringBuffer sb;

    Producer(){
        sb=new StringBuffer();   //allot memory
    }


    public void run(){

        synchronized (sb) {
            //append data to string buffer
            for (int i = 1; i <= 10; i++) {
                try {
                    sb.append(i).append(":");
                    Thread.sleep(200);
                    System.out.println("appending......");
                } catch (Exception e) {
                }
            }
            sb.notify();
        }
    }
}

class Consumer extends Thread{
    //Create producer reference to refer to producer object from consumer class
    Producer prod;

    Consumer(Producer prod){
        this.prod=prod;
    }


    public void run(){
        synchronized (prod.sb){
            try{
                prod.sb.wait();
            }
            catch(Exception e){}

            System.out.println(prod.sb);
        }
    }
}
