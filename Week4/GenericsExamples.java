public class GenericsExamples {



    public static <T> void printArray(T [] inputArray){

      for(T array:inputArray){
          System.out.println(array);
      }

    }

    public static void main(String[] args) {


        Integer [] integerarray ={1,2,3,4,5,6,6};
        String [] StringArray={"mahesh","subbu","kamal"};
        Character [] charArray={'a','b','c','d','e'};


        printArray(integerarray);

    }


}
