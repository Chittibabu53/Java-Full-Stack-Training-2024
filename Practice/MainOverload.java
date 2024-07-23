public class MainOverload {
    public static void main(String[] args) {
        System.out.println("Running standard main method");
        // Normal application logic here

    }


    public static void main(String[] args, boolean debugMode) {

        if (debugMode) {
            System.out.println("Running main method with debug mode enabled");
            // Additional debugging logic here
        } else {
            System.out.println("Running main method with debug mode disabled");
            // Normal application logic here
        }
    }
}
