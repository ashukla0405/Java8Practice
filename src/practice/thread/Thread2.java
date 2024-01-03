package practice.thread;

public class Thread2 implements Runnable{

    @Override
    public void run() {
/**
        for(int i=0;1<4;i++)
        {
            System.out.println(Thread.currentThread() + " "+ i);
        }*/
        for(int i=0;i<5; i++){
            System.out.println("Hi Thread" + i);
        }
    }
}
