import java.util.Scanner;

public class palin {


        public static void main (String args[]){
            int r, sum = 0, temp;
//            int n = 454;

            Scanner sc =new Scanner(System.in);


            System.out.println("please enter the number :");
            int n=sc.nextInt();

            temp = n;
            while (n > 0) {
                r = n % 10;
                sum = (sum * 10) + r;
                n = n / 10;
            }
            if (temp == sum)
                System.out.println(" it is a palindrome number ");
            else
                System.out.println("not palindrome ");
        }
    }

