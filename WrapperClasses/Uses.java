public class Uses {

    public static void main (String [] args){

        //Creating an array of Integer wrapper classes

        Integer [] array={1,2,3,4,5,5,6,7,8};

        for (Integer i:array){
            System.out.println(i);
        }

        //boxing and unboxing
//        boxing
        int number=10;
        Integer numericValue=Integer.valueOf(number);
        System.out.println(numericValue);

//        unboxing
        int num=numericValue.intValue();

    }

}
