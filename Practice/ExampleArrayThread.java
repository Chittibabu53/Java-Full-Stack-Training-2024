import java.util.Stack;

public class ExampleArrayThread extends RuntimeException {

     ExampleArrayThread(String s){
         super(s);
     }


  static void money() throws Exception{
         throw new Exception("jimmy");
     }
    public static void main(String[] args) {


        int age=10;

        try{
            money();
        }
        catch (Exception e){
            e.printStackTrace();
        }


          if(age<17){
              throw new ExampleArrayThread("age not met");
          }



    }
}
