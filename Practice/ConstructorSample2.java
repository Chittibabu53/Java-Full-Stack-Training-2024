class Example9{

    Example9(){
        System.out.println(" i am empty of parent");
    }

    Example9(String parent){
        System.out.println("i am super class Constructor");
    }

}





public class ConstructorSample2 extends Example9 {



private     ConstructorSample2(){
        System.out.println("sample 2 constructor empty");
    }

    ConstructorSample2(String name){
         super("");
        System.out.println("sample2 constructor not empty");
    }




  public static void main(String[] args) {



//  new ConstructorSample2();
//
//  new ConstructorSample2("ji");


  int bro;



    }
}
