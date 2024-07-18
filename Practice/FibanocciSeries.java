public class FibanocciSeries {

    public static void main(String[] args) {

        int num1=0;
        int num2=1;
        int count=10;
        int sum=0;
        for (int i = 0; i < count; i++) {
            System.out.print(num1 + " ");
            sum = num1 + num2;
            num1 = num2;
            num2 = sum;
        }


    }
}
