// Custom unchecked exception
class CustomUncheckedException extends RuntimeException {
    public CustomUncheckedException(String message) {
        super(message);
    }
}

// Example class using the custom unchecked exception
class Example6 {
    public void processData(int value) {
        if (value == 0) {
            throw new CustomUncheckedException("Value cannot be zero");
        }
        // Process data here
    }
}

// Main class demonstrating the usage of CustomUncheckedException
public class CustomUncheckedExceptionExample {
    public static void main(String[] args) {
        Example6 example = new Example6();
        try {
            example.processData(0); // Throws CustomUncheckedException
        } catch (CustomUncheckedException e) {
            e.printStackTrace(); // Handle the exception
        }
    }
}
