import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {


    public static void main(String [] args){

        Deque<Integer> sample=new ArrayDeque<>() ;

        sample.addFirst(1);
        sample.addFirst(2);
        sample.addLast(3);

//        System.out.println(sample.peek());
//        System.out.println(sample.peekFirst());
//        System.out.println(sample.peekLast());
//        sample.poll();
//        sample.pollFirst();
//        System.out.println(sample);

        for(int num:sample){
            System.out.println(num);

        }

    }
}
