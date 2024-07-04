interface  kkk{
   default void don1()
   {
       System.out.println("imkkk");
   }
}
interface ll{
   default void don1(){
       System.out.println("im ll");
   }
}
interface ok extends ll,kkk{
   default void don1(){
       System.out.println("im ok");
   }
}


public class Examples implements ok {



    public static void main(String[] args) {

        Examples obj=new Examples();

        obj.don1();



    }
}
