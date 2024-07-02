
class Conquer{

}


public class Multithreading implements  Runnable{

    @Override
    public void run() {
        System.out.println("thread is running");
    }

    static String man="jijij";
    public static void main(String[] args){

      Runnable r1=new Multithreading();
      Thread t1=new Thread(r1,"multi threading name");

      t1.start();



      String str= t1.getName();

        System.out.println(str);









    }

}
