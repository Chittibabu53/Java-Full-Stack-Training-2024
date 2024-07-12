import java.util.Collections;
import java.util.LinkedList;

public class SingletonClass {


    public static void main(String[] args) {

        Single.main(new String[]{""});

    }
}



 class Single extends SingletonClass{


    public static void main(String[] args) {


        LinkedList<Integer> linkedList=new LinkedList<>();
        LinkedList<Integer> linkedList1=new LinkedList<>();

        for(int i=1;i<6;i+=2){
            linkedList.add(i);
        }
        for(int i=2;i<7;i+=2){
            linkedList1.add(i);
        }

        for(int i=0;i<linkedList1.size();i++){

            linkedList.add(linkedList1.get(i));
        }

        Collections.sort(linkedList);
        System.out.println(linkedList);

    }

        }
