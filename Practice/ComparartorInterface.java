import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ComparartorInterface {

    public static void main(String[] args) throws Exception {
       HashMap<Integer,String> hashMap=new HashMap<>();

        for (int i = 0; i < 11; i++) {
            hashMap.put(i,"jyo");
        }


        Map<Integer, String> filteredMap = hashMap.entrySet()
                .stream()
                .filter(entry -> entry.getKey() > 5)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        System.out.println(filteredMap);

//        entryStream.filter(x->x.getKey()>5).forEach(System.out::println);



//        Arrays.sort(strs,(Comparator.comparingInt(x->x.charAt(0))));

//        System.out.println(Arrays.toString(strs));



    }
}
