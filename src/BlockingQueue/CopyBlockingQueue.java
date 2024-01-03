package BlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class CopyBlockingQueue {

    public static void main(String[] args) {
        BlockingQueue<String> blkQueue=new ArrayBlockingQueue<>(5);
        Producer1 producer1=new Producer1(blkQueue);
        Consumer1 consumer1=new Consumer1(blkQueue);

        Thread threadProducer=new Thread(producer1);
        Thread threadConsumer=new Thread(consumer1);

        threadProducer.start();
        threadConsumer.start();





    }

     static class Producer1 implements Runnable{

        BlockingQueue<String> blkQueue=null;
        public Producer1(BlockingQueue blkQueue){
            super();
            this.blkQueue=blkQueue;

        }

        @Override
        public void run() {
            try {
                System.out.println("Producing Element 1");
                blkQueue.put("Element 1");
                Thread.sleep(1000);

                System.out.println("Producing Element 2");
                blkQueue.put("Element 2");
                Thread.sleep(1000);

                System.out.println("Producing Element 3");
                blkQueue.put("Element 3");
                Thread.sleep(1000);
            }
            catch (InterruptedException ex){
                ex.printStackTrace();
            }

        }
    }

    static class Consumer1 implements Runnable{


        BlockingQueue<String> blkQueue=null;
        public Consumer1(BlockingQueue blkQueue){
            super();
            this.blkQueue=blkQueue;

        }

        @Override
        public void run() {
            //System.out.println("Consuming started");
            while(true){

                try {
                    System.out.println("Consumed" + blkQueue.take());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }

        }
    }
}
