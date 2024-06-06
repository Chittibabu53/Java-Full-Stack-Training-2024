import java.util.Scanner;

public class ScannerInteger {

    public static void main(String []args){


                Scanner scanner = new Scanner(System.in);
                int number;

                while (true) {
                    System.out.print("Enter an integer: ");
                    if (scanner.hasNextInt()) {
                        number = scanner.nextInt();
                        break;
                    } else {
                        System.out.println("That's not a valid integer. Please try again.");
                        scanner.next();
                    }
                }

                System.out.println("You entered: " + number);
                scanner.close();
            }
        }






