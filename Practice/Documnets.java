interface Subbbu{

    void mine(int a,int b);
}

interface Llo{

    void ll();
}

abstract  class Jimk{
    abstract void jimmy();

    abstract  void jimm1();
}



public class Documnets {




    public static void main(String[] args) {

        Subbbu obj=(a,b)-> System.out.println("hi");
//        {
//            System.out.println("hi");
//            System.out.println(a+b);
//        };

        obj.mine(1,3);


        Subbbu kok=new Subbbu() {
            @Override
            public void mine(int a, int b) {
                System.out.println();
            }
        };


        Jimk OBJ9=new Jimk(){
            void jimmy(){
                System.out.println("jimmy");
            }

            @Override
            void jimm1() {
                System.out.println("jim11");
            }
        };

        OBJ9.jimmy();
        OBJ9.jimm1();




    }
}