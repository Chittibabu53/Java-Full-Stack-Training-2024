
import java.util.*;

public class LinkedMaps {

    public static void main(String[] args) {

        List<Integer> list=new ArrayList<>();
        Collections.addAll(list,1,2,3,4,3,4,5);
        Map<Integer,Integer> map=new HashMap<>();

        list.forEach((x)->
        {
            map.compute(x, (key, oldValue) -> oldValue == null ? 1 : oldValue + 1);
        });

        map.forEach((x,y)-> {
            if (y==2) System.out.println(x);
        });

    }
}



//            map.compute(x, (key, oldValue) -> {
//                if (oldValue == null) {
//                    return 1; // Initialize to 1 if key is not present
//                } else {
//                    return oldValue + 1; // Increment the value if key is already present
//                }
//            });

//            if(!map.containsKey(x)){
//                map.put(x, 1);
//            }
//            else {
//                map.put(x,map.get(x)+1);
//            }
