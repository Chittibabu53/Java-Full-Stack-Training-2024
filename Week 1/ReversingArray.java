public class ReversingArray {

        public static void main(String[] args) {
            int[] numbers = {3, 5, 7, 2, 8};
            int[] reversed =new int[ numbers.length];

            for (int i = 0; i < numbers.length; i++) {
                reversed[i] = numbers[numbers.length - 1 - i];

                System.out.println(reversed[i]);
            }


            int  a=10;

            int b=20;

//            a=a+b;
//
//            b=a-b;
//
//            a=a-b;
//

            a=a^b;


            System.out.println(a+""+b);

        }
    }




