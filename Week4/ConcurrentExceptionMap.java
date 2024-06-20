import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentExceptionMap {


    public static void main(String[] args){

//        Map<Integer,String> map=new ConcurrentHashMap<>();

        ConcurrentHashMap<Integer,String> map=new ConcurrentHashMap<>();

        map.put(1,"hello");
        map.put(2,"hi");


        Iterator<Map.Entry<Integer,String>> iterator=map.entrySet().iterator();

        while (iterator.hasNext()){
            Map.Entry<Integer,String> entry=iterator.next();

            System.out.println(entry.getKey()+"  "+entry.getValue());

            map.put(4,"d");    //exception occurs here when not using concurrentHashmap

        }

//        for(Map.Entry<Integer,String> entry: map.entrySet()){
//
//            System.out.println(entry.getKey()+","+entry.getValue());
//
//            map.put(4,"ji");
//
//        }

    }
}
