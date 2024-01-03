package practice.thread;

public class InterruptExample {

    public static void main(String[] args) {
        Thread myThread = new Thread(() -> {
            try {
                for (int i = 1; i <= 5; i++) {
                    System.out.println("Count: " + i);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
            }
        });

        myThread.start();

        try {
            Thread.sleep(3000); // Main thread sleeps for 3 seconds
            myThread.interrupt(); // This will interrupt myThread
            System.out.println("State fter intrupt" + myThread.getState());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
