public class TernaryOperator {

    public static void  main(String[] args){

        int a=20, b=30, c=40 ,result;

        result= ((a>b)?a>c? a:c : (b>c)? b:c);

        System.out.println(result);

    }
}
