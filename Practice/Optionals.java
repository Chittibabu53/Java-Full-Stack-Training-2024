import java.util.Optional;

public class Optionals {

    public static void main(String[] args) {
        String [] array=new String[10];

        Optional<String> stringOptionals= Optional.ofNullable(array[5]);

        if(stringOptionals.isPresent()){
             System.out.println(array[5].toLowerCase());
        }
        else{
            System.out.println("it is null");
        }
    }
}
