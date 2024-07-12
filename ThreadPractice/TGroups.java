package ThreadPractice;

//Wap to demonstrate the creation of the thread groups and some methods which act on thread groups.
public class TGroups {
    public static void main(String[] args) throws Exception{
        Reservation res=new Reservation();
        Cancellation can=new Cancellation();

        //Create Thread group with name
        ThreadGroup tg=new ThreadGroup("First Group");

        //Create 2 threads and add them to First Group
        Thread t1=new Thread(tg,res,"First Thread");
        Thread t2=new Thread(tg,can,"Second Thread");

        //Create another thread group tg1 as a child to tg
        ThreadGroup tg1=new ThreadGroup(tg,"Second Group");

        //Create 2 thread and add them to Second group
        Thread t3=new Thread(tg1,can,"Third Thread");
        Thread t4=new Thread(tg1,can,"Fourth Thread");

        //find parent group of tg1
        System.out.println("Parent of tg1= "+tg1.getParent());

        //set max priority to tg1 as 7
        tg1.setMaxPriority(7);

        System.out.println("Thread group of t1= "+t1.getThreadGroup());
        System.out.println("Thread group of t3= "+t3.getThreadGroup());

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        //find how many threads are actively running
        System.out.println("No of threads active in tg= "+tg.activeCount());

    }
}

class Reservation extends Thread{
    public void run(){
        System.out.println("This is reservation thread");
    }
}

class Cancellation extends Thread{
    public void run(){
        System.out.println("This is cancellation thread");
    }
}
