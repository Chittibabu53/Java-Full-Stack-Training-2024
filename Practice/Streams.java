import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;




 class Streams {


 int mahesh=1;

    void jyo(){
        System.out.println(str);
        String jyothika;

    }


    static String str;

    static void main(String[] args) {

        List<Integer> obj=new ArrayList();

        obj.add(1);


        obj.add(3);

        obj.add(4);

        obj.add(56);

//        System.out.println(obj);


        Stream<Integer> stream=obj.stream();

        Set<Integer> set=obj.stream().filter(x->x%2==0).collect(Collectors.toSet());
//        System.out.println(set);

//        stream.filter(x->x%2==0).forEach(System.out::println);


        Integer []  jyo=new Integer[3];


        String [] jythiString=new String[5];

        Boolean [] booljyo=new Boolean[5];

        Object [] objJyo=new Object[5];

        System.out.println(objJyo[0]);



        System.out.println(str);





















//        System.out.println(obj);


        int []  array={1,2,3};

        int []  arrray1={4,5,6};

        int [] arraysum=new int[6];


//        for(int i=0;i<arraysum.length;i++){
//
//            if(i<array.length){
//                arraysum[i]=array[i];
//            }
//            else {
//                arraysum[i]=arrray1[i-arrray1.length];
//            }
//        }
//

//        for(int num:arraysum){
//            System.out.print(num);
//        }
//        System.out.println();
//
//        if(arraysum.length%2==0){
//
//            double median=arraysum[(arraysum.length/2)]+arraysum[(arraysum.length/2-1)];
//            System.out.println(median/2);
//
//        }
//        else{
//            System.out.println(arraysum[arraysum.length/2]);
//        }





    }
}
