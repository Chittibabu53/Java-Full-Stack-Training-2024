import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class ScannerFile {


        public static void main(String[] args) {
            try {
                // Create a File object for the file to be read
                File file = new File("C:\\Users\\baluj\\IdeaProjects\\FullStackJava\\Week 2 Programs\\input.txt");

                // Create a Scanner object to read from the file
                Scanner scanner = new Scanner(file);

                // Read and process the file line by line
                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    System.out.println(line);
                }

                // Close the scanner
                scanner.close();
            } catch (FileNotFoundException e) {
                System.out.println("File not found.");
                e.printStackTrace();
            }
        }
    }

