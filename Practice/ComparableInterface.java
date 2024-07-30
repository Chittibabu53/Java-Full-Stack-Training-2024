import java.util.ArrayList;
import java.util.Collections;


class Movies implements Comparable<Movies>{

     String name;
     int year;


    Movies(int year,String name ){
       this.name=name;
       this.year=year;
    }


    @Override
    public int compareTo(Movies o) {
        return this.year-o.year;
    }

    public int getYear(){
        return year;
    }
    public String getName(){
        return  name;
    }

    public String toString() {
        return this.name+" "+this.year;
    }
}

public class ComparableInterface {

    public static void main(String[] args) {

        ArrayList<Movies> arrayList=new ArrayList<>();

        arrayList.add(new Movies(2001,"hulk"));
        arrayList.add(new Movies(2002,"hulk"));
        arrayList.add(new Movies(2005,"hulk"));
        arrayList.add(new Movies(2006,"hulk"));


        Collections.sort(arrayList);
        System.out.println(arrayList);



    }
}
