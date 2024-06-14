public class HashTableResizeTest {
    public static void main(String[] args) {
        // Create a CustomHashtable with an initial capacity of 4 (small for testing)
        CustomHashtable<String, Integer> table = new CustomHashtable<>(4);

        // Adding elements to the Hashtable and printing its capacity and size
        for (int i = 1; i <= 10; i++) {
            table.put("Key" + i, i);
            System.out.println("Added Key" + i + ", Size: " + table.size());
        }
    }
}
