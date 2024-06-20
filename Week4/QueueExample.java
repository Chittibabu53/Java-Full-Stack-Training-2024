import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;

public class QueueExample {

    public static void main(String[] args){

        Queue<Integer> sample=new ConcurrentLinkedDeque<>();


        sample.add(1);
        sample.add(2);
        sample.add(3);

//        sample.poll();

        System.out.println(sample.peek());

        for(int numjj:sample){
            System.out.println(numjj);

            sample.poll();
        }

    }
}
