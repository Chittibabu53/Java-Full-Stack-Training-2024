import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class ScannerFile {


        public static void main(String[] args) {
            try {
                File file = new File("C:\\Users\\baluj\\IdeaProjects\\FullStackJava\\Week 2 Programs\\input.txt");

                Scanner scanner = new Scanner(file);

                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    System.out.println(line);
                }

                scanner.close();
            } catch (FileNotFoundException e) {
                System.out.println("File not found.");
                e.printStackTrace();
            }
        }
    }

