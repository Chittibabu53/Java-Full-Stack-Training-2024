import java.util.Optional;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.*;

public class LCM  {
    private int a;
    private int b;
    private static int result; // Static variable to hold the LCM result


//    public LCM(int a, int b, CountDownLatch latch) {
//        this.a = a;
//        this.b = b;
//        this.latch = latch;
//    }



    public static void main(String[] args) throws InterruptedException {
        int a = 4;
        int b = 6;


//        LCM lcm1 = new LCM(a, b, latch);
//        LCM lcm2 = new LCM(a, b, latch);

//        Thread t1 = new Thread(lcm1);
//        Thread t2 = new Thread(lcm2);

//        t1.start();
//        t2.start();

        System.out.println("LCM of " + a + " and " + b + " is: " + result);

        BlockingDeque<Integer>   ibj=new LinkedBlockingDeque<>();

        BlockingQueue<Integer>  obj=new LinkedBlockingDeque<>();

        Queue<Integer> obj1=new PriorityQueue<>();
        Stack<Integer>   stack=new Stack<>();

        PriorityBlockingQueue<Integer> priorityBlockingQueue=new PriorityBlockingQueue();


        Optional<LCM>  jimmyk=Optional.ofNullable(new LCM());





    }
}
