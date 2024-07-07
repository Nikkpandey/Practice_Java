package ThreadPractice;

public class Simple {
    public static void main(String[] args) {
        MyThread1 obj=new MyThread1();

        Thread t1=new Thread(obj);

        t1.start();
    }

}

class MyThread1 implements Runnable{
    public void run(){
        task1();
        task2();
        task3();
    }

    void task1(){
        System.out.println("This is task1");
    }

    void task2(){
        System.out.println("This is task 2");
    }

    void task3(){
        System.out.println("This is task 3");
    }
}
