import java.util.*;
import java.util.concurrent.PriorityBlockingQueue;

public class SingletonClass {


    public static void main(String[] args) {

        Single.main(new String[]{""});

    }
}

 class Single extends SingletonClass{


    public static void main(String[] args) {

        PriorityBlockingQueue<Integer> obj33=new PriorityBlockingQueue<Integer>();

        LinkedList<Integer> linkedList1=new LinkedList<>();
        LinkedList<Integer> linkedList2=new LinkedList<>();

        for(int i=1;i<6;i+=2){
            linkedList1.add(i);
        }

        for(int i=2;i<7;i+=2){
            linkedList2.add(i);
        }

        for(int i=0;i<linkedList2.size();i++){

            linkedList1.add(linkedList2.get(i));
        }

        Collections.sort(linkedList1);
        System.out.println(linkedList1);


        Collections.addAll(linkedList1,1,2,3,3,4);

//        System.out.println(b);
        System.out.println(linkedList1);


        List<Integer>  list=new ArrayList<>();






    }

        }
