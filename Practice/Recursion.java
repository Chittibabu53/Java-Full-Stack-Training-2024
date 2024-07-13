import java.util.Collections;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;

public class Recursion extends Thread {
    @Override
    public void run() {
        System.out.println((recurse(2,3)));
    }

    static int recurse(int base, int power){

        if(base==power){
            base*=base;
        }
        if(base==power*power) {
            base *= base / power;

            return base;

        }
        power--;


        return recurse(base,power);
    }

    public static void main(String[] args) {


       Recursion thread1=new Recursion();
       Recursion thread2=new Recursion();

       thread1.start();
       thread2.start();


       System.out.println( ClassLoader.getPlatformClassLoader());
       System.out.println(ClassLoader.getSystemClassLoader());

        Queue<Integer> obj=new LinkedBlockingDeque<>();

        Collections.addAll(obj,1,2,3,4,5,6,8,9,7,6,5,3,797,65,6);


        System.out.println(obj);

    }
}
