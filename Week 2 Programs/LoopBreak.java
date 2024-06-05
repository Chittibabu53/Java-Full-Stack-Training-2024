public class LoopBreak {

    public static void main(String[] args) {

        int [] numbers ={1,2,3,4,5,6,7};

        boolean continueloop=true;


        for (int number:numbers){


            if(!continueloop){
                break;
            }

            System.out.println(number);

            if(number==3){
                continueloop=false;

            }
        }
    }
}
