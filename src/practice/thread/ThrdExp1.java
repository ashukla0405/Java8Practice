package practice.thread;

public class ThrdExp1 {
    public static void main(String[] args) {

        Thread th1 =new Thread(() -> {

                for (int i = 1; i < 6; i++) {
                    System.out.println("Thread1 Count is " + i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
        });

        Thread th2=new Thread(() -> {
            try {
                th1.join();
                for (int j = 6; j < 11; j++) {
                    System.out.println("Thread2 is count" + j);


                       // Thread.sleep(2000);

                }
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        } );
        th1.start();
        th2.start();
        System.out.println("Both thread started");


    }
}

