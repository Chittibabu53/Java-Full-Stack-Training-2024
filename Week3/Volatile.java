
    class SharedData {
        volatile boolean flag = false;

        public void toggleFlag() {
            flag = !flag;
        }

        public void printFlag() {
            System.out.println("Flag: " + flag);
        }
    }

    public class Volatile {
        public static void main(String[] args) {
            final SharedData sharedData = new SharedData();

            // Thread to toggle the flag
            Thread toggleThread = new Thread(() -> {
                for (int i = 0; i < 5; i++) {
                    sharedData.toggleFlag();
                    try {
                        Thread.sleep(100); // Simulate some work
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });

            // Thread to print the flag value
            Thread printThread = new Thread(() -> {
                for (int i = 0; i < 5; i++) {
                    sharedData.printFlag();
                    try {
                        Thread.sleep(100); // Simulate some work
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });

            toggleThread.start();
            printThread.start();
        }
    }

