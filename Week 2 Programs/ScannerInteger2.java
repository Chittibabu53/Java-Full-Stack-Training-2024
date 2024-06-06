import java.util.Scanner;

public class ScannerInteger2 {



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int number = 0;
            boolean valid = false;

            while (!valid) {
                System.out.print("Enter an integer: ");
                String input = scanner.next();
                try {
                    number = Integer.parseInt(input);
                    valid = true;
                } catch (NumberFormatException e) {
                    System.out.println("That's not a valid integer. Please try again.");
                }
            }

            System.out.println("You entered: " + number);
            scanner.close();
        }
    }

