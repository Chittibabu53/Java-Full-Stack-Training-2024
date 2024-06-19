import java.util.ArrayList;

class Person1 {
    String name;
    int age;

    Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

public class ArrayListCustomExample {
    public static void main(String[] args) {
        // Create an ArrayList of custom objects
        ArrayList<Person1> people = new ArrayList<>();

        // Add elements to the ArrayList
        people.add(new Person1("John", 25));
        people.add(new Person1("Jane", 30));
        people.add(new Person1("Tom", 35));

        // Print the ArrayList
        System.out.println("ArrayList of People: " + people);

        // Iterate over the ArrayList
        System.out.println("Iterating over ArrayList:");
        for (Person1 person : people) {
            System.out.println(person);
        }
    }
}


