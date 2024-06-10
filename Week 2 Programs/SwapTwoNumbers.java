public class SwapTwoNumbers {


    public static void  main(String[] args){

                int a = 5;
                int b = 10;

                System.out.println("Before swap: a = " + a + ", b = " + b);

                a = a ^ b; // a now becomes 15 (binary 0101 ^ 1010 = 1111)
                b = a ^ b; // b now becomes 5 (binary 1111 ^ 1010 = 0101)
                a = a ^ b; // a now becomes 10 (binary 1111 ^ 0101 = 1010)

                // Display swapped values
                System.out.println("After swap: a = " + a + ", b = " + b);
            }
        }

