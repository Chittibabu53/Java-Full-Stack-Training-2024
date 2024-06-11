public class TwoSumProblem {


    public static void main (String[]args){

        int [] array ={2,7,11,15};
        int target=9;
        int sum=0;


      l1:  for(int i=0;i< array.length;i++){

            for(int j=0;j< array.length;j++){

                if(array[j]+array[i]==target &&  i!=j){
                    System.out.println(array[i]+" "+array[j]);
                    break l1;

                }




            }


        }
    }
}
