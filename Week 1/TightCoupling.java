class Bs{

    void perform(){
        System.out.println("b is performed");
    }
}

class As{
    private  Bs bs;

     public As(){
        this.bs=new Bs();
    }

    void something(){
        bs.perform();
    }

}




public class TightCoupling {

    public static void main(String[] args) {

    As as=new As();
    as.something();



    }
}
