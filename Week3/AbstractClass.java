
abstract class Monkeys {
    // Abstract method (does not have a body)
    public abstract void makeSound();

    // Regular method
    public void eat() {
        System.out.println("This animal is eating.");
    }
}

class Dogs extends Monkeys {
    // The body of the abstract method is provided here
    public void makeSound() {
        System.out.println("Woof");
    }
}

class Cat extends Monkeys {
    // The body of the abstract method is provided here
    public void makeSound() {
        System.out.println("Meow");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        Dogs dog = new Dogs();
        Cat cat = new Cat();

        dog.makeSound(); // Outputs: Woof
        dog.eat();       // Outputs: This animal is eating.

        cat.makeSound(); // Outputs: Meow
        cat.eat();       // Outputs: This animal is eating.
    }
}





