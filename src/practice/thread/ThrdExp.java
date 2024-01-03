package practice.thread;

public class ThrdExp {
    public static void main(String[] args) {

        Object lock = new Object(); // Object used for synchronization

        Thread th1 =new Thread(() -> {
            synchronized (lock) {


                for (int i = 1; i < 6; i++) {
                    System.out.println("Thread1 Count is " + i);
                    try {
                        Thread.sleep(1000);
                        lock.notify();


                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }

        });

        Thread th2=new Thread(() -> {
            synchronized (lock) {


                for (int j = 6; j < 11; j++) {
                    System.out.println("Thread2 is count" + j);
                    try {
                        Thread.sleep(2000);
                        lock.wait();
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        } );
        th1.start();
        th2.start();
/**
        try{
            th1.join();

        }
        catch (InterruptedException ex3){
            ex3.printStackTrace();
        }*/


        }
    }

