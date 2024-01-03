package practice.thread;

public class RunnableExample implements Runnable{

    public static void main(String[] args) {
        System.out.println("Inside : " + Thread.currentThread().getName());

        System.out.println("Creating Runnable...");

        Runnable runnable = new RunnableExample();

        Runnable runnable1=new RunnableExample();

        //System.out.println("Creating Thread...");
        Thread thread = new Thread(runnable);
        Thread thread1=new Thread(runnable1);






        //System.out.println("Starting Thread...");
        thread.start();
        thread1.start();

    }
    @Override
    public void run() {

        for (int i=0;i<11;i++){
            System.out.println("Print i="  + i);
        }


    }
}
