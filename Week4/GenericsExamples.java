class MethodExamples <T,K>{

     T term1;
     K term2;
   public   MethodExamples (T term1,K term2){

       this.term1=term1;
       this.term2=term2;


    }



}



public class GenericsExamples {



    public static <T,K extends Number> void printArray(T [][]  inputArray){

      for(T[] array:inputArray){
          for(T sum:array){
              System.out.println(sum);
          }
      }

    }

    public static void main(String[] args) {

         MethodExamples<Integer,String> obj=new MethodExamples<>(1,"terms");

        Integer [][] integerarray ={{1,2,3,},{4,5,6,6}};
        String [] StringArray={"mahesh","subbu","kamal"};
        Character [] charArray={'a','b','c','d','e'};


        printArray(integerarray);

    }


}
