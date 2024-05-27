import java.util.Scanner;

public class InputExample {


    public static void main(String []args){

        Scanner sc=new Scanner(System.in);
        System.out.println("please enter the number :");

        int inputnumber=sc.nextInt();

        int[] arr={1,2,3,4,5,6,7,8,9,10};

       if (inputnumber<=9){
           System.out.println(arr[inputnumber-1]);
        }
       else{
           System.out.println("index of array not exists");
       }


    }
}
