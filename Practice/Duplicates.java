import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class Duplicates {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList=new ArrayList<>();

        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);


        for (int i = 0; i < arrayList.size(); i++) {
            Integer current = arrayList.get(i);
            System.out.print(current);


            // Check if current element is already seen before
            for (int j = 0; j < i; j++) {
                System.out.println();
                System.out.print(arrayList.get(j));
                if (arrayList.get(j).equals(current)) {
                    // If duplicate found, remove it and adjust index
                    arrayList.remove(i);
                    i--;
                    break;
                }
            }
        }

        System.out.println(arrayList);

//        HashSet<Integer>  hashSet=new HashSet<>();
//
//        hashSet.addAll(arrayList);
//
//        arrayList.clear();
//
//        arrayList.addAll(hashSet);




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
