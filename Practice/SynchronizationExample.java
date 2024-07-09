public class SynchronizationExample {

    private static int[] array = {1, 2, 3, 4, 5};
    private static int index = 0;
    private static final Object lock = new Object();


    public static void main(String[] args) {

        Arrayprinter thread1 = new Arrayprinter("jjimmy");
        Arrayprinter thread2 = new Arrayprinter("subbu");

        thread1.start();
        thread2.start();

    }

    static class Arrayprinter extends Thread {

        private String threadName;

        public Arrayprinter(String threadName) {
            this.threadName = threadName;

        }

        @Override
        public void run() {
            while (true) {
                synchronized (lock) {
                    while (index < array.length) {
                        System.out.println(threadName + " " + array[index]);
                        index++;
                    }
                }

                if(index== array.length){
                  index=0;
                }

                lock.notifyAll();

                try{
                      if(index<array.length){
                          lock.wait();
                      }
                }
                catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
