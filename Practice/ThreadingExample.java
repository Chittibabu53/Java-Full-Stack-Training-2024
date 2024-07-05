class Exam extends Thread{

    private int  counter;


    Exam(int counter){
        this.counter=counter;
    }

    @Override
  synchronized public void run() {
        for(int i=0;i<10;i++){
           counter++;
            System.out.println(Thread.currentThread().getName());
        }

    }

    public int  getCount(){
        return counter;
    }
}



public class ThreadingExample{

    public static void main(String[] args) {

        Exam obj=new Exam(0);

        Thread thread1=new Thread(obj);
        Thread thread2=new Thread(obj);

        thread1.start();
        thread2.start();
        try{

            thread1.join();
            thread2.join();
        }
        catch (Exception e){
            e.printStackTrace();
        }


        System.out.println(obj.getCount());



    }
}