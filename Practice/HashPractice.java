import java.util.Hashtable;
import java.util.Map;

public class HashPractice {
    public static void main(String[] args) {
        Hashtable<String, Integer> hashtable = new Hashtable<>();

        // Allocate key-value pairs
        hashtable.put("Mia", 1);
        hashtable.put("Tim", 2);
        hashtable.put("Leo", 3);
        hashtable.put("Som", 4);
        hashtable.put("Beb", 5);

        // Print hashtable
        for (Map.Entry<String, Integer> entry : hashtable.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }



    }
}
