interface Inox{
     int m=0;
    void subbu();

}
interface Inox2 extends Inox{


    void subbu();
}

public class Documnets  implements Inox {


    public void subbu() {
        System.out.println("from direct");
    }

    public static void main(String[] args) {

        Inox2 boj=new Inox2() {
            @Override
            public void subbu() {
                System.out.println("from ayonymours");
            }
        };


   Inox2 obj2=()->{
       System.out.println("hello from lambda exprression");
        };



   Documnets obj3=new Documnets();
   obj3.subbu();
   obj2.subbu();
   boj.subbu();
        System.out.println(m);









    }
}
