import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class Wildcards{

    public static void print(List<? super Number> list){
        for(Object num:list){
            System.out.println(num);
        }
    }

    public static void main(String[] args) {

        List<Number> list = new ArrayList<>();
        Collections.addAll(list, 2, 3, 3, 3, 2, 23);

        List<Number> listDouble = new ArrayList<>();
        Collections.addAll(listDouble, 2.3, 4.4, 5.4, 6.7, 8.9);

        List<String> listString=new ArrayList<>();
        Collections.addAll(listString,"bjimmy","subbu");

        List<Object> objectList=new ArrayList<>();
        Collections.addAll(objectList,new ArrayThread());


        print(list);
        print(listDouble);
        print(objectList);



        
    }
}
