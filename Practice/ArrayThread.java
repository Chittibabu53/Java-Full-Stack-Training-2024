public class ArrayThread {
     static int[] arr = {1, 2, 3, 4, 5};



    public static void main(String[] args) {

        Runnable r1=new ArrayPrintingTask();
        Thread t1=new Thread(r1);
        Thread t2=new Thread(r1);

        t1.start();
        t2.start();


    }

    static class ArrayPrintingTask implements Runnable {
      public  void run(){

        synchronized (arr) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
      }
    }
}
