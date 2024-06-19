public class PracticeThread {

    public static class MyRunnable implements Runnable{

        private  int vName;

        public void run(){

            vName=(int)(Math.random()*50D);

            try{
                Thread.sleep(1000);
            }
            catch(Exception e){

            }
            System.out.println(vName);
        }
    }



    public static void main(String [] args){

         MyRunnable myRunnable=new MyRunnable();


         Thread t1=new Thread(myRunnable);
         Thread t2=new Thread(myRunnable);


         t1.start();
         t2.start();


    }


}
