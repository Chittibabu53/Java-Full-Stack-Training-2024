// Custom checked exception
class CustomCheckedException extends Exception {
    public CustomCheckedException(String message) {
        super(message);
    }
}

// Example class using the custom checked exception
class Example5 {
    public void processData(int value) throws CustomCheckedException {
        if (value < 0) {
            throw new CustomCheckedException("Value cannot be negative");
        }
        // Process data here
    }
}

// Main class named CustomCheckedException
public class CustomCheckedExceptionMain {
    public static void main(String[] args) {
        Example5 example = new Example5();
        try {
            example.processData(-1); // Throws CustomCheckedException
        } catch (CustomCheckedException e) {
            e.printStackTrace(); // Handle the exception
        }
    }
}
