// Java Program to Demonstrate Working of
// Comparator Interface

// Importing required classes
import java.lang.*;
import java.util.*;

// Class 1
// A class to represent a Student
class Student1 {

    // Attributes of a student
    int rollno;
    String name, address;

    // Constructor
    public Student1(int rollno, String name, String address)
    {

        // This keyword refers to current instance itself
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }

    // Method of Student class
    // To print student details in main()
    public String toString()
    {

        // Returning attributes of Student
        return this.rollno + " " + this.name + " "
                + this.address;
    }
}

// Class 2
// Helper class implementing Comparator interface
class Sortbyroll implements Comparator<Student1> {

    // Method
    // Sorting in ascending order of roll number
    public int compare(Student1 a, Student1 b)
    {

        return a.rollno - b.rollno;
    }
}

// Class 3
// Helper class implementing Comparator interface
class Sortbyname implements Comparator<Student1> {

    // Method
    // Sorting in ascending order of name
    public int compare(Student1 a, Student1 b)
    {

        return a.name.compareTo(b.name);
    }
}

// Class 4
// Main class
class GFG {

    // Main driver method
    public static void main(String[] args)
    {

        // Creating an empty ArrayList of Student type
        ArrayList<Student1> ar = new ArrayList<Student1>();

        // Adding entries in above List
        // using add() method
        ar.add(new Student1(111, "Mayank", "london"));
        ar.add(new Student1(131, "Anshul", "nyc"));
        ar.add(new Student1(121, "Solanki", "jaipur"));
        ar.add(new Student1(101, "Aggarwal", "Hongkong"));

        // Display message on console for better readability
        System.out.println("Unsorted");

        // Iterating over entries to print them
        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));

        // Sorting student entries by roll number
        Collections.sort(ar, new Sortbyroll());

        // Display message on console for better readability
        System.out.println("\nSorted by rollno");

        // Again iterating over entries to print them
        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));

        // Sorting student entries by name
        Collections.sort(ar, new Sortbyname());

        // Display message on console for better readability
        System.out.println("\nSorted by name");

        // // Again iterating over entries to print them
        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));
    }
}
