public class MainOverloading {
//    MainOverloading(int a){
//        System.out.println("integer passed");
//    }
//
//    public static void main(String[] args){
//        MainOverloading obj = new MainOverloading(12.0);
//    }

    // Original main method
    public static void main(String[] args) {

        System.out.println("Original main method");
        for (String arg : args) {
            System.out.println(arg);
        }

        main(3);
        main("jimk","subbu");

    }

    // Overloaded main method
    public static void main(int number) {
        System.out.println("Overloaded main method with int parameter: " + number);
    }

    // Another overloaded main method
    public static void main(String arg1, String arg2) {
        System.out.println("Overloaded main method with two String parameters: " + arg1 + ", " + arg2);
    }
}
