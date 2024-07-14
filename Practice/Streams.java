import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {

    public static void main(String[] args) {

        ArrayList obj=new ArrayList();

        obj.add(1);

        obj.add("jimmy");

        obj.add(3);

        obj.add(4);

        obj.add(56);

//        System.out.println(obj);


        Stream<ArrayList> stream=obj.stream();



//        System.out.println(obj);


        int []  array={1,2,3};

        int []  arrray1={4,5,6};

        int [] arraysum=new int[6];


        for(int i=0;i<arraysum.length;i++){

            if(i<array.length){
                arraysum[i]=array[i];
            }
            else {
                arraysum[i]=arrray1[i-arrray1.length];
            }
        }


        for(int num:arraysum){
            System.out.print(num);
        }
        System.out.println();

        if(arraysum.length%2==0){

            double median=arraysum[(arraysum.length/2)]+arraysum[(arraysum.length/2-1)];
            System.out.println(median/2);

        }
        else{
            System.out.println(arraysum[arraysum.length/2]);
        }





    }
}
