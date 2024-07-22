import java.util.Random;

public class RandomNumbers {

    public static void main(String[] args) throws InterruptedException {
        Random random = new Random();

        while (true) {
            int randomNumber = 3 + random.nextInt(16); // Generates random number between 3 and 18
            System.out.println("Random number: " + randomNumber);

            Thread.sleep(3000); // Sleep for 30 seconds
        }
    }
}
