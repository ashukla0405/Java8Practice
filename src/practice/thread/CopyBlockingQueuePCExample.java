package practice.thread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class CopyBlockingQueuePCExample {
    public static void main(String[] args) {
        BlockingQueue<String> queue=new ArrayBlockingQueue<>(2);
        Producer2 producer2=new Producer2(queue);
        Consumer2 consumer2=new Consumer2(queue);

        Thread thread1=new Thread(producer2);
        Thread thread2=new Thread(consumer2);
        thread1.start();
        thread2.start();

    }
}

class Producer2 implements Runnable{

    BlockingQueue<String> queue=null;

    public Producer2(BlockingQueue queue){
        super();
        this.queue=queue;
    }

    @Override
    public void run() {

        //System.out.println("Producing Element 1");
        try {
            System.out.println("Producing Element 1");
            queue.put("Element 1");
            Thread.sleep(1000);
            System.out.println("Producing Element 2");
            queue.put("Element 2");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
class Consumer2 implements Runnable{

    BlockingQueue<String> queue=null;

    public Consumer2(BlockingQueue queue){
        super();
        this.queue=queue;
    }

    @Override
    public void run() {
        while (true) {


            try {
                System.out.println("Consumed--" + queue.take());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }
}