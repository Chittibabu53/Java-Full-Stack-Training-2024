import java.util.*;

public class CollectionFramework {

    public static void main(String[] args) {


        HashMap<Integer,Integer> hashMap=new HashMap<>();

        for (int i=0;i<6;i++){

            hashMap.put(i,i+5);
        }



//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//
//        }


        for (Map.Entry<Integer,Integer> obj:hashMap.entrySet()){
            System.out.println(obj);
        }

         for(int num:hashMap.keySet()){
//             System.out.println(num);
             System.out.println(hashMap.get(num));
         }

         LinkedHashMap<Integer,ArrayList<Integer>> linkedHashMap=new LinkedHashMap<>();

        for (int i=0;i<6;i++){
            if(!linkedHashMap.containsKey(i)){
                linkedHashMap.put(i,new ArrayList<Integer>());

                linkedHashMap.get(i).add(i);
            }
            else {
                linkedHashMap.get(i).add(i);
            }


        }
        Iterator iterator=linkedHashMap.entrySet().iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }



     TreeSet<Integer> obj=new TreeSet<>();

        int []arr ={1,2,3,4,4,4,5};

        for(int i=0;i< arr.length;i++){

            obj.add(i);
        }
        System.out.println(obj);







    }
}
