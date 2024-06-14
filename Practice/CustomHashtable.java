import java.util.Hashtable;

public class CustomHashtable<K, V> extends Hashtable<K, V> {
    private int threshold;
    private static final float LOAD_FACTOR = 0.75f;
    private int currentCapacity;

    public CustomHashtable(int initialCapacity) {
        super(initialCapacity);
        this.currentCapacity = initialCapacity;
        this.threshold = (int)(initialCapacity * LOAD_FACTOR);
    }

    @Override
    public synchronized V put(K key, V value) {
        if (size() >= threshold) {
            // Simulate resizing
            System.out.println("Resizing: Current capacity: " + currentCapacity + ", Size: " + size());
            currentCapacity *= 2;
            threshold = (int)(currentCapacity * LOAD_FACTOR);
            System.out.println("New capacity: " + currentCapacity + ", New threshold: " + threshold);
        }
        return super.put(key, value);
    }
}
