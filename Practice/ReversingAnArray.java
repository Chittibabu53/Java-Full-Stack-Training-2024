public class ReversingAnArray {
    public static void  main (String[] args) {

        int[] array = new int[]{5, 6, 7, 8, 9, 5, 2, 3, 43};

        int i=0;
        int last = array.length - 1;

//        for ( i=last;i>= 0;i--){
//
//            System.out.print(" "+array[i]);
//
//        }


        while(i<last){

            int temp=array[i];
            array[i]=array[last];

            array[last]=temp;

         i++;
         last--;

        }

        for(int num:array){

            System.out.println(num);
        }

    }
}
