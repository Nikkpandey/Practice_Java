package ThreadPractice;

// WAP depicting situation in which deadlock can occur
class BookTicket extends Thread
{
    // Assuming train, compartment as Object
    Object train, comp;

    BookTicket(Object train, Object comp)
    {
        this.train=train;
        this.comp=comp;
    }

    public void run() {
        //lock on train
        synchronized (train) {
            System.out.println("BookTicket locked on train");
            try {
                Thread.sleep(150);
            } catch (InterruptedException ie) {
            }

            System.out.println("BookTicket now waiting to lock on compartment");

            synchronized (comp) {
                System.out.println("BookTicket locked on compartment");
            }
        }
    }
}

    class CancelTicket extends Thread
    {
        //Assuming train and compartment as object
        Object train,comp;
        CancelTicket(Object train, Object comp)
        {
            this.train=train;
            this.comp=comp;
        }

        public void run()
        {
            synchronized (comp)
            {
                System.out.println("Cancel ticket locked on compartment");

                try{
                    Thread.sleep(200);
                }
                catch(InterruptedException ie){}
                System.out.println("Cancel ticket now waiting to lock on train");

                synchronized(train)
                {
                    System.out.println("Cancel ticket locked on train");
                }
            }
        }
    }

public class DeadLock1 {
    public static void main(String[] args) throws Exception{
        //take train, compartment as object of object class
        Object train=new Object();
        Object comp=new Object();

        //objects to BookTicket, CancelTicket classes
        BookTicket obj1=new BookTicket(train,comp);
        CancelTicket obj2= new CancelTicket(train,comp);

        //attach 2 threads to these object
        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);

        //run the threads on the objects
        t1.start();
        t2.start();
    }

}
