import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ComparartorInterface {

    public static void main(String[] args) throws Exception {
       HashMap<Integer,String> hashMap=new HashMap<>();

       Map<Integer,String> hashMap1= Collections.synchronizedMap(hashMap);

        for (int i = 0; i < 11; i++) {

            int j=0;
            hashMap.put(j,"jyo");
        }


        Map<Integer, String> filteredMap = hashMap.entrySet()
                .stream()
                .filter(entry -> entry.getKey() > 5)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        System.out.println(filteredMap);
        System.out.println(hashMap);

//        entryStream.filter(x->x.getKey()>5).forEach(System.out::println);



//        Arrays.sort(strs,(Comparator.comparingInt(x->x.charAt(0))));

//        System.out.println(Arrays.toString(strs));



    }
}
