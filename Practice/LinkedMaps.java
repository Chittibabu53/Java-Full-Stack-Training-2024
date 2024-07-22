import java.util.*;

public class LinkedMaps {

    public static void main(String[] args) {

        List<Integer> list=new ArrayList<>();
        Collections.addAll(list,1,2,3,4,3,4,5,5,5);
        Map<Integer,Integer> map=new HashMap<>();

        list.forEach((x)->
        {
            if(!map.containsKey(x)){
                map.put(x, 1);
            }
            else {
                map.put(x,map.get(x)+1);
            }
        });

        map.forEach((x,y)-> {
            if(y==2){
                System.out.println(x);
            }
        });

    }
}
