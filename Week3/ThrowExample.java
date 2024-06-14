import java.io.IOException;

public class ThrowExample {
    public static void main(String[] args) {
        try {
            checkAge(21);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void checkAge(int age) throws  ArithmeticException {
        if (age < 18) {
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        } else {
            System.out.println("Access granted - You are old enough!");
        }
    }
}
