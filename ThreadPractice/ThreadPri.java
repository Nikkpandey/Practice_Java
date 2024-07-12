package ThreadPractice;
//Thread Priority

class Priority extends Thread{
    int count =0;     //counts number
    public void run() {
        for (int i = 1; i <= 10000; i++)
        {
            count++;    //count numbers upto 10000
        }
            System.out.println("Completed thread: " + Thread.currentThread().getName());
            System.out.println("Priority: " + Thread.currentThread().getPriority());
    }
}


public class ThreadPri {
    public static void main(String[] args) {
        Priority obj=new Priority();

        //Create two threads
        Thread t1=new Thread(obj,"One");
        Thread t2=new Thread(obj,"Two");

        //set priority
        t1.setPriority(2);
        t2.setPriority(Thread.NORM_PRIORITY);

        t1.start();
        t2.start();
    }
}