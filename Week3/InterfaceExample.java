

    // Interface declaration
    interface Shape {
        // Constant declaration
        double PI = 3.14;

        // Abstract method (method without body)
        double calculateArea();

        // Default method (since Java 8)
        default void display() {
            System.out.println("This is a shape.");
        }

        // Static method (since Java 8)
        static void printInfo() {
            System.out.println("Interface Shape");
        }
    }

    // Class implementing the interface
    class Circle implements Shape {
        private double radius;

        // Constructor
        public Circle(double radius) {
            this.radius = radius;
        }

        // Implementing abstract method to calculate area
        @Override
        public double calculateArea() {
            return PI * radius * radius;
        }
    }

    public class InterfaceExample {
        public static void main(String[] args) {
            // Creating an object of Circle class
            Circle circle = new Circle(5.0);

            // Calling methods from Circle class
            double area = circle.calculateArea();
            System.out.println("Area of circle: " + area);

            // Calling default method from Shape interface
            circle.display();

            // Calling static method from Shape interface
            Shape.printInfo();
        }
    }

