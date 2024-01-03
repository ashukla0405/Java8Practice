package practice.thread;

public class JoinExample {

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread 1: Count " + i);
                try {
                    Thread.sleep(1000); // Simulating some work
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread 2: Count " + i);
                try {
                    Thread.sleep(1000); // Simulating some work
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join(); // Main thread waits for thread1 to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Thread 1 has completed.");
    }
}