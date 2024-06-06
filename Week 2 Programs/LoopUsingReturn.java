public class LoopUsingReturn {

    public static void main(String[] args){

        int[]numbers ={1,2,3,4,5,6,7};

        printNumbers(numbers);
    }


    public static  void printNumbers(int[] numbers){

        for(int number:numbers){
            System.out.println(number);

            if(number==3)
            {
                return;

            }
        }
    }
}
