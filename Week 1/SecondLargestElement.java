public class SecondLargestElement {
    public static void main(String[] args) {
        int[] numbers = {2,1};
        int firstMax = 0;
        int secondMax = 0;



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
