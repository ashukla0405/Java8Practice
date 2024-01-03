package practice.thread;

import java.util.concurrent.CountDownLatch;

public class CopyCountDownLatchDemo1 {

    public static void main(String[] args) throws InterruptedException {

        CountDownLatch latch=new CountDownLatch(2);
        Worker2 worker21=new Worker2(1000,latch,"Worker2--Thread --1");
        Worker2 worker22=new Worker2(1000,latch,"Worker2--Thread --2");
        worker21.start();
        worker22.start();
        latch.await();

        System.out.println(Thread.currentThread().getName() + " has finished");
    }
}

class Worker2 extends Thread{

    private int delay;
    private CountDownLatch latch;

    public Worker2(int delay,CountDownLatch latch,String name){
        super(name);
        this.delay=delay;
        this.latch=latch;
    }
    @Override
    public void run() {
        try {
            sleep(1000);
            latch.countDown();
            System.out.println(Thread.currentThread().getName() + " has finished in run method");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
