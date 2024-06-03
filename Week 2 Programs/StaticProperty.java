
class Pages {

    int pageNo;
    String module;

    static String name ="subbu";

    Pages(int x,String y){
        pageNo=x;
        module=y;

    }

    void display(){
        System.out.println(pageNo+" "+name+" "+module);
    }
 }



public class StaticProperty {

    public static void main (String [] args){


        Pages obj1=new Pages(111,"444");
        Pages obj2=new Pages(222,"333");


        obj1.display();
        obj2.display();

    }
}
