package practice.thread;

public class RunnableWithLambda {

    public static void main(String[] args) {


        Runnable th1 = () -> {
            for (int i = 0; i < 11; i++) {
                System.out.println("Thread1 calling" + i);
            }

        };
        Runnable th2 = () -> {
            for (int j = 11; j < 21; j++) {
                System.out.println("Thread2 calling" + j);
            }


        };
        Thread t1=new Thread(th1);
        t1.start();
        try {
            t1.sleep(1000);
        }
        catch (InterruptedException e){
            System.out.println(e.toString());
        }

        Thread t2=new Thread(th2);
        t2.start();
    }
}
