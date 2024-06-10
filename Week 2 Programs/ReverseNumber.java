import java.util.Scanner;

public class ReverseNumber {




        public static void main (String args[]){
            int r, sum = 0;

            Scanner sc =new Scanner(System.in);


            System.out.println("please enter the number :");
            int n=sc.nextInt();

            while (n > 0) {
                r = n % 10;
                sum = (sum * 10) + r;
                n = n / 10;
            }

            System.out.println(sum);




        }
    }



