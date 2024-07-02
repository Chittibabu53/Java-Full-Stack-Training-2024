class Preferrred extends  Thread{


    int [] array={1,2,3,4,5};

    @Override
    public void run() {

        synchronized (array) {
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i]+" ");
            }
            System.out.println();
        }
    }
}



public class UsingSet {


    public static void main(String[] args) {


   Preferrred p=new Preferrred();

   Thread thread1=new Thread(p);

   Thread thread2=new Thread(p);


   thread1.start();
   thread2.start();





    }
}
