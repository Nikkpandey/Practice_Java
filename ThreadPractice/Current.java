package ThreadPractice;

public class Current {
    public static void main(String[] args) {
        System.out.println("Let us find the current thread");
        Thread t=Thread.currentThread();
        System.out.println("Current thread is: "+t);
        System.out.println("Its name is: "+t.getName());
    }
}
