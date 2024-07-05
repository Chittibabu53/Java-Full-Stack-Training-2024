interface Ao{
    default void bro(){
        System.out.println("im bro");
    }
}
interface  B extends Ao{
    @Override
    default void bro() {
        System.out.println("im from b");
    }
}
interface  C extends Ao{
    @Override
    default void bro() {
        System.out.println("im from c");
    }
}


public class DiamondProblem implements B,C{

    @Override
    public void bro() {
        C.super.bro();
        B.super.bro();
    }

    public static void main(String[] args) {

        DiamondProblem obj=new DiamondProblem();

        B obj2=new DiamondProblem();
        obj2.bro();

        obj.bro();

    }
}
