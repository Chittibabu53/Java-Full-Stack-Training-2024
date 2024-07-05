interface  kkk{
   default void don1()
   {
       System.out.println("imkkk");
   }

   void koko();
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
   void jjjj();

}


public class Examples implements ok {

    static int k;

    @Override
    public void don1() {
        ok.super.don1();

    }

    @Override
    public void koko() {

    }

    @Override
    public void jjjj() {

    }

    public static void main(String[] args) {

        Examples obj=new Examples();

        obj.don1();



    }
}
