import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashmapExample {

    public static void main (String [] args){

        ConcurrentHashMap<String,Integer> map=new ConcurrentHashMap<>();

        map.put("Apple", 10);
        map.put("Banana", 20);
        map.put("Orange", 30);

        // Runnable task to read from the map
        Runnable readTask = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + " reading Apple: " + map.get("Apple"));
                try {
                    Thread.sleep(100); // Simulate some delay
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        // Runnable task to write to the map
        Runnable writeTask = () -> {
            for (int i = 0; i < 5; i++) {
                int newValue = map.get("Apple") + 1;
                map.put("Apple", newValue);
                System.out.println(Thread.currentThread().getName() + " updated Apple to: " + newValue);
                try {
                    Thread.sleep(150); // Simulate some delay
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        // Create and start threads for reading
        Thread readThread1 = new Thread(readTask, "ReadThread-1");
        Thread readThread2 = new Thread(readTask, "ReadThread-2");
        readThread1.start();
        readThread2.start();

        // Create and start threads for writing
        Thread writeThread1 = new Thread(writeTask, "WriteThread-1");
        Thread writeThread2 = new Thread(writeTask, "WriteThread-2");
        writeThread1.start();
        writeThread2.start();

        // Wait for all threads to finish
        try {
            readThread1.join();
            readThread2.join();
            writeThread1.join();
            writeThread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Final state of the map
        System.out.println("Final map state: " + map);


    }
}
