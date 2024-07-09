class Zoom{
 private final Object lock=new Object();

 private boolean condition=false;

 public void waitForCondition() throws InterruptedException{

     synchronized (lock){
         while(!condition){
             System.out.println("before wait");
             lock.wait();
         }
     }
 }
 public void waitForNotification(){
     synchronized (lock){
         condition=true;
         lock.notify();
         System.out.println("after notify");
     }
 }

}

public class Multithreading1 extends Zoom {

    public static void main(String[] args) throws InterruptedException {

        Multithreading1 obj=new Multithreading1();

        Thread waitingThread=new Thread(()->{
           try{
               System.out.println("thread is waiting");
             obj.waitForCondition();
            }
           catch(Exception e){
             e.printStackTrace();
            }
        });

        Thread notifyThread=new Thread(()->{
            obj.waitForNotification();
            System.out.println("notify finished");
        });




        waitingThread.start();
        Thread.sleep(1000);
        notifyThread.start();

        waitingThread.join();
        notifyThread.join();



    }
}