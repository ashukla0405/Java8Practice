package practice.thread;

public class ThrdYeild {

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            System.out.println("Thread 1 is running.");
            System.out.println("Thread 1 is running.");
            System.out.println("Thread 1 is running.");
            System.out.println("Thread 1 is running.");
            System.out.println("Thread 1 is running.");
            System.out.println("Thread 1 is running.");
            System.out.println("Thread 1 is running.");

            Thread.yield(); // Suggest to the scheduler that it can give a turn to another thread
            System.out.println("Thread 1 is running again.");
        });

        Thread thread2 = new Thread(() -> {
            System.out.println("Thread 2 is running.");
        });

        thread1.start();
        thread2.start();

        Thread mainThread = Thread.currentThread();
        System.out.println("Main thread name: " + mainThread.getName());
    }
}
