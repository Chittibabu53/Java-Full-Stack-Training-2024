import java.util.*;

public class Merged {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList1 = new LinkedList<>();
        Collections.addAll(linkedList1,1,3,5);
        LinkedList<Integer> linkedList2 = new LinkedList<>();
        Collections.addAll(linkedList2,2,4,6);
        for (int i=0; i<linkedList2.size(); i++){
//            if(linkedList1.get(i)<linkedList2.get(i)) {
            linkedList1.add(linkedList2.get(i));
//            }
        }
//         Collections.sort(linkedList1);
//        System.out.println(linkedList1);
        ListIterator<Integer> listIterator = linkedList1.listIterator();
//        while (listIterator.hasNext()){
//            System.out.println(listIterator.next());
//        }
//        linkedList1.stream().sorted().forEach(x-> System.out.println(x));
        System.out.println(linkedList1);
        linkedList1.sort((x,y)->{
            int num = x>y ? x:y;
            System.out.println(x+" "+y);
            return (x < y) ? -1 : ((x == y) ? 0 : 1);
        });



        System.out.println(linkedList1);





    }
}