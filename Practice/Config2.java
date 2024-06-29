
interface function{
    void m1();

    default void kk(){

    }

    private void kl(){

    }

}

class Chitti implements function{

   public void m1(){

  }


}

 abstract  class Document implements function{

      public abstract void m1();
        abstract  void m2();
        abstract void m3();



        }

  abstract class Document1 extends Document{

   public void m1(){
        System.out.println("doc 1");
    }

  }




class Mahesh extends  Document1{
     void m2(){
         System.out.println("mah m2");
     }

     void m3(){
         System.out.println("mah m3");
     }
}


public class Config2 {



    public static void main(String[] args) {

    Mahesh obj=new Mahesh();


    obj.m1();
    obj.m2();
    obj.m3();





    }
}
