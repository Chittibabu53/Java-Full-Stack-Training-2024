public class MinAndMaxArray {

    public static void main (String[] args){

        int [] array={1,4,5,6,5,3,2,9,8,6,7,8,8,9,8};

        int min=array[0];
        int max=array[0];


        for(int i=0; i< array.length;i++){

            if(array[i]>max){
                max=array[i];

            }

            if(array[i]<min){
                min=array[i];

            }

        }

        System.out.println(max);
        System.out.println(min);

    }
}
