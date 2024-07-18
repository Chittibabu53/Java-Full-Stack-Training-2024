import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class NumericalList {

    // Helper method to print a list of numerical values
    public static void printNumericalList(List<? extends Number> list) {
        for (Object num : list) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void printObjectList(List<? super String> list){
      for(Object num2:list){
          System.out.println(num2+" ");
      }
        System.out.println();

    }

    public static void main(String[] args) {
        // Creating a list that accepts numerical values
        List<Integer> intList = new ArrayList<>();
        intList.add(10);
        intList.add(20);
        intList.add(30);


        // Printing the list of integers
        System.out.println("Integer List:");
        printNumericalList(intList);

        // Creating a list that accepts long values
        List<Long> longList = new ArrayList<>();
        longList.add(100L);
        longList.add(200L);
        longList.add(300L);

        // Printing the list of longs
        System.out.println("Long List:");
        printNumericalList(longList);


        List<String> stringList=new ArrayList<>();
        stringList.add("jimmy");
        stringList.add("jimk");


        List<Object>objectList=new ArrayList<>();
        objectList.add(new AccessModifiers());
        objectList.add(new ArrayThread());


        printObjectList(stringList);
        printObjectList(objectList);
    }
}
