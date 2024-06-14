
import java.util.*;


public class Hashtable2 {


        public static void main(String[] args) {
            // Creating a Hashtable
            Hashtable<Integer, String> table = new Hashtable<>();

            // Adding key-value pairs
            table.put(1, "Apple");
            table.put(2, "Banana");
            table.put(3, "Cherry");


            // Retrieving a value based on key
            String fruit = table.get(2); // Returns "Banana"
            System.out.println("Fruit at key 2: " + fruit);

            // Checking if a key exists
            boolean hasKey = table.containsKey(3); // Returns true
            System.out.println("Table contains key 3: " + hasKey);

            // Checking if a value exists
            boolean hasValue = table.containsValue("Apple"); // Returns true
            System.out.println("Table contains value 'Apple': " + hasValue);

            // Removing a key-value pair
//            table.remove(1);

            // Iterating over the Hashtable
            for (Map.Entry<Integer, String> entry : table.entrySet()) {
                System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
            }

            System.out.println(table);
        }
    }


