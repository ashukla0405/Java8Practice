package practice.thread;

public class ThreadSample {

    public static void main(String[] args) {

        //Thread1 thread1= new Thread1();
        //thread1.start();
        Thread2 thread23=new Thread2();
        Thread th=new Thread(thread23);
        th.start();


    }
}
