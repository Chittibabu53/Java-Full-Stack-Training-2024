import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class SecondLargestElement{

    public static void main(String[] args) {


  int []  array={1,5,6,3,2,8,10};

        Set<Integer> set=new HashSet<>();

        set.add(1);
        set.add(5);
        set.add(6);
        set.add(3);
        set.add(2);
        set.add(8);
        set.add(10);




        set.stream().filter(x->x%2==0).map(x->x*x).forEach(System.out::println);

       // use  collectors.toset ()
//        set.stream().map(x->x*x).forEach(System.out::println);


    }}