package ThreadPractice;

public class DeadLock2 {
    public static void main(String[] args) {
        Object train=new Object();
        Object comp=new Object();

        BookTicket2 obj1=new BookTicket2(train,comp);
        CancelTicket2 obj2=new CancelTicket2(train,comp);

        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);

        t1.start();
        t2.start();
    }
}

class BookTicket2 extends Thread{
    Object train, comp;

    BookTicket2(Object train,Object comp){
        this.train=train;
        this.comp=comp;
    }

    public void run(){
        synchronized(train){
            System.out.println("BookTrain locked on train");
            try{
                Thread.sleep(150);
            }
            catch(InterruptedException ie){}

            System.out.println("BookTrain waiting to lock on compartment");
            synchronized(comp){
                System.out.println("BookTicket Locked on compartment");
            }
        }
    }
}

class CancelTicket2 extends Thread{
    Object train, comp;

    CancelTicket2(Object train,Object comp){
        this.train=train;
        this.comp=comp;
    }

    public void run(){
        synchronized(train){
            System.out.println("CancelTrain locked on train");
            try{
                Thread.sleep(200);
            }
            catch(InterruptedException ie){}

            System.out.println("CancelTrain waiting to lock on compartment");
            synchronized(comp){
                System.out.println("CancelTicket Locked on compartment");
            }
        }
    }
}
