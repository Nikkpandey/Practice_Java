package ThreadPractice;
class Reserve implements Runnable{
    int available=1;
    int wanted;

    Reserve(int i){
        wanted=i;
    }

    public void run(){
        //display available berth
        System.out.println("Available berth: " +available);
        if(available>=wanted){
            //get the name of the passenger
            String name=Thread.currentThread().getName();
            //allot the berth
            System.out.println(wanted+" Berths reserved for "+name);
            try{
                //wait for printing the ticket
                Thread.sleep(2000);
            }
            catch(InterruptedException ie){

            }
        }
        else{
            System.out.println("Sorry, no berths");
        }
    }
}

public class Ticket1 {
    public static void main(String[] args) {
        // tell that 1 berth needed
        Reserve r=new Reserve(1);
        Thread t1=new Thread(r);
        Thread t2=new Thread(r);

        t1.setName("First Passenger");
        t2.setName("Second Passenger");

        t1.start();
        t2.start();
    }
}
