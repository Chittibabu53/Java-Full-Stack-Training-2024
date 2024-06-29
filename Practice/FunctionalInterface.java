import java.util.function.Function;

interface Back{
//    void perFormAction(String message);

    void maheshlol(int x);
}

abstract  public class FunctionalInterface implements Back{

    public static void main(String[] args) {

        Back obj=(x -> System.out.println("perfrom action"+x*5));

//        obj.perFormAction("hello bro");


        obj.maheshlol(9);




    }

}
