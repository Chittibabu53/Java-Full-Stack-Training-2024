public class JoinExample {
    public static void main(String[] args) {
        // Create a new thread (Thread B)
        Thread thread = new Thread(() -> {
            System.out.println("Thread B started.");
            try {

                Thread.sleep(2000); // Simulating some time-consuming task
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread B completed.");
        });

        // Start Thread B
        thread.start();

        // Main thread (Thread A) waits for Thread B to complete
        try {
//            thread.join(); // Thread A will wait here until Thread B completes
            System.out.println("Thread A resumed after Thread B completed.");
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Main thread (Thread A) completed.");
    }
}

