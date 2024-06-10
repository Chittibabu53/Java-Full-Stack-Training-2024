public class SecondElement {

        public static void main(String[] args) {
            int[] numbers = {3, 5, 7,7, 2, 8,8, 10, 6, 4};
            int firstMax = Integer.MIN_VALUE;
            int secondMax = Integer.MIN_VALUE;

            for (int num : numbers) {
                if (num > firstMax) {
                    secondMax = firstMax;
                    firstMax = num;
                } else if (num > secondMax && num != firstMax) {
                    secondMax = num;
                }
            }

            System.out.println("The second largest element is " + secondMax);
        }
    }

