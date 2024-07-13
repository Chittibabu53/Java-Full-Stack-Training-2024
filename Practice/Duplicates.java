import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class Duplicates {

    public static void main(String[] args) {

        CopyOnWriteArrayList<Integer> arrayList=new CopyOnWriteArrayList<Integer>();

        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);


        HashSet<Integer>  hashSet=new HashSet<>();

        hashSet.addAll(arrayList);

        arrayList.clear();

        arrayList.addAll(hashSet);

        System.out.println(arrayList);


        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "apple");
        hashMap.put(2, "banana");
        hashMap.put(3, "apple");
        hashMap.put(4, "orange");
        hashMap.put(5, "banana");


        Iterator<Map.Entry<Integer,String>> iterator=hashMap.entrySet().iterator();
        HashSet<String> hashSet1=new HashSet<>();


        while (iterator.hasNext()){
            Map.Entry<Integer,String>  entry=iterator.next();

            String value=entry.getValue();


            if(hashSet1.contains(value)){
                iterator.remove();
            }
            else{
                hashSet1.add(value);
            }
        }

        System.out.println(hashMap);

    }
}
