import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ScannerPattern {

    public static void main(String[] args){


        try {


            File obj = new File("C:\\Users\\baluj\\IdeaProjects\\FullStackJava\\Week 2 Programs\\input.txt");


            Scanner obj1 = new Scanner(obj);


            while(obj1.hasNextLine()){
                obj1.nextLine();

                String email=obj1.findInLine(Pattern.compile("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}"));
                if(email!=null){
                    System.out.println(email);
                }

            }

        }
        catch (FileNotFoundException e){

        }
    }
}
