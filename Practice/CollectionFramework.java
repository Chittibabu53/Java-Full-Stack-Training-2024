//import java.util.*;
//
//public class CollectionFramework {
//
//    public static void main(String[] args) {
//
//
//        HashMap<Integer,Integer> hashMap=new HashMap<>();
//
//        for (int i=0;i<6;i++){
//
//            hashMap.put(i,i+5);
//        }
//
//
//
////        while (iterator.hasNext()){
////            System.out.println(iterator.next());
////
////        }
//
//
//        for (Map.Entry<Integer,Integer> obj:hashMap.entrySet()){
//            System.out.println(obj);
//        }
//
//         for(int num:hashMap.keySet()){
////             System.out.println(num);
//             System.out.println(hashMap.get(num));
//         }
//
//         LinkedHashMap<Integer,ArrayList<Integer>> linkedHashMap=new LinkedHashMap<>();
//
//        for (int i=0;i<6;i++){
//            if(!linkedHashMap.containsKey(i)){
//                linkedHashMap.put(i,new ArrayList<Integer>());
//
//                linkedHashMap.get(i).add(i);
//            }
//            else {
//                linkedHashMap.get(i).add(i);
//            }
//
//
//        }
//        Iterator iterator=linkedHashMap.entrySet().iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
//
//
//
//     TreeSet<Integer> obj=new TreeSet<>();
//
//        int []arr ={1,2,3,4,4,4,5};
//
//        for(int i=0;i< arr.length;i++){
//
//            obj.add(i);
//        }
//        System.out.println(obj);
//
//
//
//
//
//
//
//    }
//}


import com.sun.source.tree.Tree;

import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class CollectionFramework{


    public static void main(String[] args) {
        String s="abc";
        String l="abc";


        String sl=new String("abc");

        String s2=new String("jimky");


        System.out.println(s==sl.intern());

//        System.out.println(sl==s2);


//        System.out.println(s==l);

        System.out.println(s.hashCode());
        System.out.println(l.hashCode());



        float f=1.23f;

        double d=1.23;

        long lll=1111111;

        short sh=123;


        byte b=1;

        int in=123;


        char ch=11111;


        String sm="Hello World";

        String [] array= sm.split(" ");

        System.out.println(Arrays.toString(array));

        for(int i= array.length-1;i>=0;i--){
            System.out.print(array[i]+" ");
        }
        System.out.println();


        PriorityQueue<Integer> obj=new PriorityQueue<>();

        ArrayList<Integer> obj1=new ArrayList(obj);

           Random r=new Random();

          for (int i = 0; i < 21; i++) {

              obj1.add(r.nextInt(100));

          }
           Collections.sort(obj1);
           System.out.println(obj1);


           Queue obj7=new LinkedList();

          for(int i=0;i<21;i++){
              obj7.add(i);
          }
          obj7.poll();
        System.out.println(obj7.peek());

        System.out.println(obj7);



        TreeMap<Integer,Integer> obj4=new TreeMap<>();
        HashMap<Integer,Integer>obj5=new HashMap<>();
        Hashtable<Integer,Integer> obj6=new Hashtable<>();


       for(int i=0;i<21;i++){
            obj6.put(r.nextInt(100),r.nextInt(100));
        }
        System.out.println(obj6);

        Stream<Integer> stream=obj6.keySet().stream();
        Stream<Integer> stream1=obj6.values().stream();

//        stream.filter(n->n<50).forEach(n-> System.out.print(n+" "));
        System.out.println();
        stream1.filter(x->!(x>20) ||!(x<30)).forEach(n-> System.out.print(n+" "));
        System.out.println();

        List<String> dateStrings = new ArrayList<>();
        dateStrings.add("2023-07-11");
        dateStrings.add("2023-07-12");
        dateStrings.add("2023-07-13");
        dateStrings.add("2023-07-14");
        dateStrings.add("2023-07-15");
        dateStrings.add("2024-07-11");


        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        LocalDate localDate=LocalDate.now();

        List<LocalDate> localDates=dateStrings.stream() .map(dateString -> LocalDate.parse(dateString, formatter))
                .filter(date -> (date.isEqual(localDate)))
                .collect(Collectors.toList());

        localDates.forEach(System.out::println);








    }
}