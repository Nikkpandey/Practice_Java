package ThreadPractice;

class Daemon1 implements Runnable{
    public void run(){
        System.out.println("Daemon Thread");
    }
}
public class ThreadDaemon {
    public static void main(String[] args) {
        System.out.println("Main Thread");
        Daemon1 d=new Daemon1();
        Thread t=new Thread(d);
        t.setDaemon(true);
        t.start();
    }
}
