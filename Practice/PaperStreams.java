import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PaperStreams {

    public static void main(String[] args) {

        int [] array={1,5,6,3,2,8,10};

        Set<Integer> list=new HashSet<>();

        for(int i=0;i< array.length;i++){
            list.add(array[i]);
        }

        list.stream().filter(x->x%2==0).map(x->x*x).forEach(System.out::println);
    }
}
