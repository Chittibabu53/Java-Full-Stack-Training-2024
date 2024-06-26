class Name{

  public  Name(String name1){
        System.out.println("mahesh");

    }
}



public class ConstructorSample extends  Name  {

    ConstructorSample(int value){
        this("");


        if (value < 0) {
            System.out.println("Negative value provided, constructor exiting early.");
            return; // Exit the constructor early if value is negative
        }

//        this.value = value;
        System.out.println("Value set to " );


    }

//    void ConstructorSample(){
//
//    }




     ConstructorSample(String s){

         super("from child");
        System.out.println(s+"sample");
    }


    void make(){
        System.out.println("make subbu");
    }


    public static void main (String [] args){

//        ConstructorSample  obj2=new ConstructorSample("devzen");

//       new ConstructorSample();

        new ConstructorSample(9);




//        new Name("OKOK");






         }
}
