import javax.swing.event.ListDataEvent;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class GenericTypes  {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        Collections.addAll(list, 1, 2, 3, 3, 4, 5);

        Stream<Integer> result=  list.stream().filter(x->x%2==0).map(x->x*x);

        List<Integer> obj=result.collect(Collectors.toList());
        System.out.println(obj);

//      List<Integer>  list333=result.collect(Collectors.toList());
//      System.out.println(list333);

        Set<Integer> tbb=new HashSet<>();

        Collections.addAll(tbb,1,2,1,2,3,4,5,2);

        System.out.println(tbb.toArray()[tbb.toArray().length-2]);


        int [] array={10,2,3,5,4,4,3,3,5,7,8,6,6,5,7,7,4,8,5,9};
        int firstMax=0;
        int secondMax=0;
        int temp=0;
        int smax =0;
        for(int i=0;i<array.length;i++){

            if(array[i]>firstMax){
                secondMax=firstMax;
                firstMax=array[i];
            }
            else if(array[i]>secondMax&& array[i]!=firstMax){
                secondMax=array[i];

            }
        }
        System.out.println(firstMax);
        System.out.println(secondMax);
        System.out.println(smax);

//        System.out.println(tbb);
//        List<Integer>  obj22=new ArrayList<>();
//        Iterator<Integer> iterator = tbb.iterator();
//        while(iterator.hasNext()){
//            obj22.add(iterator.next());
//        }
//        Collections.addAll(obj22);

//        System.out.println();


    }


    }


