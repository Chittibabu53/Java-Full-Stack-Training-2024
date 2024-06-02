public class TernaryOperatorExamples {

    public static void main(String[] args) {



    //highest value of two numbers

    int a = 10;
    int b = 5;

    int max = (a > b) ? a : b;  // max is 10
    System.out.println("The maximum value is "+max);


        int marks = 85;

        String grade = (marks >= 90) ? "A" :
                (marks >= 80) ? "B" :
                        (marks >= 70) ? "C" :
                                (marks >= 60) ? "D" : "F";

        System.out.println("The grade is " + grade);

    }

}
