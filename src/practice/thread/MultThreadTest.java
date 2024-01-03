package practice.thread;

public class MultThreadTest {
    public static void main(String[] args)  {
        System.out.println("Before thread");

        try {
            Thrd1 thrd=new Thrd1();
            Thread t1=new Thread(thrd);
            t1.start();
            t1.join();

            Thrd2 thrd2=new Thrd2();
            Thread t2=new Thread(thrd2);
            t2.start();
        }
        catch (InterruptedException e){
            e.printStackTrace();;
        }


    }
}

class Thrd1 implements Runnable{

    @Override
    public void run() {
        for(int i=0;i<11;i++){
            System.out.println("I Is="+ i);
        }
    }
}

class Thrd2 implements Runnable{


    @Override
    public void run() {
        for(int i=11;i<21;i++){
            System.out.println("I Is="+ i);
        }
    }
}

