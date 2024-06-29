interface Same{
    interface same1{

        void kok();
    }

}

class MyKey implements Same.same1{
   public void kok(){
        System.out.println("hi");
    }

}



public class NestedInterface  {



    public static void main(String[] args) {

        Same.same1 obj;

        MyKey t =new MyKey();

        obj=t;


        obj.kok();

    }
}
