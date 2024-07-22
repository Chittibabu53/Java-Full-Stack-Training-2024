import java.util.*;

public class DuplicateAllocate {

    public static void main(String[] args) {

        List<Integer> list=new ArrayList<>();
        Collections.addAll(list,1,2,3,4,3,4,5);

        Map<Integer,Integer> map=new HashMap<>();

        for (int i = 0; i < list.size(); i++) {
            if(!map.containsKey(list.get(i))){
                map.put(list.get(i),1);
            }
            else {
                map.put(list.get(i),(map.get(list.get(i)))+1);
            }
        }

        Iterator<Map.Entry<Integer,Integer>>   iterator=map.entrySet().iterator();

      while (iterator.hasNext()){

          Map.Entry<Integer,Integer> jimk=iterator.next();
          if (jimk.getValue()==2) {
              System.out.println(jimk.getKey());
          }
      }




    }

}
