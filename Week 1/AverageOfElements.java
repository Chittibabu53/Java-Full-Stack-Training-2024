public class AverageOfElements {

    public static void main(String[] args){

                int[] numbers = {3, 5, 7, 2, 8};
                int sum = 0;

                for (int num : numbers) {
                    sum += num;
                }

                double average =  sum / numbers.length;

                System.out.println("Sum: " + sum);
                System.out.println("Average: " + average);
            }
        }



