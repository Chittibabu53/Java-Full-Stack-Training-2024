import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Hashtable3 {


    public static void main(String [] args){

        // Create a HashMap with an initial capacity of 16 and a load factor of 0.75
        Hashtable<String, Integer> map = new Hashtable<>(20);

        // Adding elements to the HashMap
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);
        map.put("Four", 4);
        map.put("Five", 5);
        map.put("Six", 6);
        map.put("Seven", 7);
        map.put("Eight", 8);
        map.put("Nine", 9);
        map.put("Ten", 10);
        map.put("Eleven", 11);
        map.put("Twelve", 12);
        map.put("Thirteen", 12);
        map.put("fourteen", 12);
        map.put("fifteen", 12);
        map.put("fifteen", 12);



        // Print the current size of the HashMap
        System.out.println(map);
        System.out.println("Current size of the HashMap: " + map.size());



    }
}
