public class SumOfEvenIndexes {

    public static void  main (String[] args){

        int [] array= {1,2,3,4,5,6,7};

        int sum=0;
        int length= array.length-1;
        for (int i=0; i<array.length;i=i+2){
            sum+=i;
        }

        System.out.println(sum);
    }
}
