package ThreadPractice;
//WAP to synchronize the thread

public class Ticket2 {
    public static void main(String[] args) {
        Reserve2 obj=new Reserve2(1);
        Thread t1=new Thread(obj,"First Passenger");
        Thread t2=new Thread(obj,"Second Passenger");

//        t1.setName("First Passenger");
//        t2.setName("Second Passenger");

        t1.start();
        t2.start();
    }
}

class Reserve2 implements Runnable{
    int available =1;
    int wanted;

    Reserve2(int i){
        wanted=i;
    }

    public void run(){
        synchronized(this){
            System.out.println("Available berth= "+available);

            if(available>=wanted){
                String name=Thread.currentThread().getName();
                System.out.println(wanted+" berth reserved for the "+name);
                try{
                    Thread.sleep(1500);
                    available-=wanted;
                }
                catch (InterruptedException ie){}
            }
            else
                System.out.println("Sorry no berth available");
        } //synchronized
    }
}
