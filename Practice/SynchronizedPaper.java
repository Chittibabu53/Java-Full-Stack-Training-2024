
public class SynchronizedPaper extends Thread {
    int [] array={1,2,3,4,5};
    @Override
public void run() {
        synchronized (array) {
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        SynchronizedPaper thread1=new SynchronizedPaper();
        SynchronizedPaper thread2=new SynchronizedPaper();

        thread1.start();
//        try{
//            thread1.join();
//        }
//        catch (Exception e){
//            e.printStackTrace();
//        }

        thread2.start();



    }
}
