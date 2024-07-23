import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Students {
    int rollNo;
    String name,address;


    Students(int rollNo,String name,String address){
              this.address=address;
              this.name=name;
              this.rollNo=rollNo;
    }

    @Override
    public String toString() {
        return this.rollNo+" "+this.name+" "+this.address;
    }

}

class SortingRoll implements Comparator<Students> {


    @Override
    public int compare(Students o1, Students o2) {
        return o1.rollNo-o2.rollNo;
    }

}
class SortingName implements Comparator<Students>{


    @Override
    public int compare(Students o1, Students o2) {
        return o1.name.compareTo(o2.name);
    }
}


public class ComparaorInterface {
    public static void main(String[] args) {


        ArrayList<Students> list=new ArrayList<>();

        list.add(new Students(1,"a","a address"));
        list.add(new Students(2,"b","b address"));
        list.add(new Students(4,"d","d address"));
        list.add(new Students(3,"c","c address"));
        list.add(new Students(5,"e","e address"));


        System.out.println("beforesorting"+list);

        Collections.sort(list,new SortingRoll());

//        System.out.println(list);

        Collections.sort(list,new SortingName());
        System.out.println(list);








    }
}
