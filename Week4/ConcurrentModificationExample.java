import java.util.ArrayList;
import java.util.Iterator;

public class ConcurrentModificationExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        // Iterate over the list
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String value = iterator.next();
            System.out.println(value);
            // Concurrently modifying the list
            list.add("D"); // This will cause ConcurrentModificationException
        }
    }
}
