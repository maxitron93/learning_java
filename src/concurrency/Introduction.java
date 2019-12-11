package concurrency;

public class Introduction {

    // This main method is run on a single, main thread
    public static void main(String[] args) {

        System.out.println("Hello There"); // This runs on the main thread

        // Runs on another thread
        Task taskRunner = new Task();
        taskRunner.start(); // This invokes the run() method in a separate thread

        // Runs on another thread
        AnotherTask taskRunner2 = new AnotherTask();
        taskRunner2.start();  // This invokes the run() method in a separate thread

        // This runs after the other thread starts - it doesn't wait unit the other thread finishes
        System.out.println("Another message"); // This runs on the main thread

        // Threads can never be restarted. To run the program again, a new instance needs to be created and run
        // taskRunner.run() // This won't work because we've already run this instance
        Task repeatedTask = new Task();
        repeatedTask.run(); // This will work because we're running a new instance of Task

    }

}

// Doing 'extends Thread' gives us access to a bunch of methods, including start()
class Task extends Thread {

    // This method has to be called run()
    public void run() {
        for(int i = 0; i < 1000; i++) {
            System.out.println("Number: " + i + " - " + Thread.currentThread().getName()); // Can get the name of the current thread
            try {
                Thread.sleep(1); // Can get the thread to pause
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}

class AnotherTask extends Thread {

    // This method has to be called run()
    public void run() {
        for(int i = 0; i > -1000; i--) {
            System.out.println(i + " - " + Thread.currentThread().getName());  // Can get the name of the current thread
            try {
                Thread.sleep(1); // Can get the thread to pause
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
