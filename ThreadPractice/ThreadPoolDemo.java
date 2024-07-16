package ThreadPractice;

//fixed thread pool eg
import java.util.concurrent.*;

public class ThreadPoolDemo {
    public static void main(String[] args) {
        ExecutorService es=Executors.newFixedThreadPool(2);      //fixed thread pool created with 2 threads
        Tasks t[]=new Tasks[4];   //number of tasks

        for(int i=0; i<4; i++){
            //attach task to the array reference
            t[i]=new Tasks(i);

            es.execute(t[i]);
        }

        es.shutdown();
    }
}

class Tasks implements Runnable{
    private int taskNo;

    Tasks(int taskNo){
        this.taskNo=taskNo;
    }
    @Override
    public void run(){
        for(int i=0; i<=100; i+=25){
            String name=Thread.currentThread().getName();
            System.out.println(name+" completed task "+ taskNo+" by "+i+" percent");

            try{
                Thread.sleep(3000);    //task is taking 3 sec
            }
            catch(Exception e){}
        }
    }
}
