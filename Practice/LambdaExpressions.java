interface Subbu{
   int lambda(int x, int y);


}

public class LambdaExpressions {

    public static void main(String[] args) {

        Subbu obj=(int x,int y)->x-y;

        System.out.println(obj.lambda(5,6));


    }
}
