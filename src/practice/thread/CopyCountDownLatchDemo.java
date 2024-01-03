package practice.thread;

import java.util.concurrent.CountDownLatch;

public class CopyCountDownLatchDemo {

    public static void main(String[] args) throws InterruptedException {

        CountDownLatch latch = new CountDownLatch(5);

        Worker1 worker1 = new Worker1(1000, latch, "WORKER-1");
        Worker1 worker2 = new Worker1(1000, latch, "WORKER-2");
        Worker1 worker3 = new Worker1(1000, latch, "WORKER-3");
        Worker1 worker4 = new Worker1(1000, latch, "WORKER-4");
        Worker1 worker5 = new Worker1(1000, latch, "WORKER-5");

        worker1.start();
        worker2.start();
        worker3.start();
        worker4.start();
        worker5.start();
        latch.await();
        System.out.println(Thread.currentThread().getName() + " has finished");

    }
}

    class Worker1 extends Thread{

        private CountDownLatch latch;
        private int delay;

        public Worker1(int delay, CountDownLatch latch, String name) {
            super(name);
            this.delay = delay;
            this.latch = latch;
        }


        @Override
        public void run() {
            try {
                Thread.sleep(delay);
                latch.countDown();
                System.out.println(Thread.currentThread().getName() + " has finished");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

