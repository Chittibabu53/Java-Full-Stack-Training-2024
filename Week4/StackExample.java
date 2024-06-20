import java.util.Stack;

public class StackExample {

    public static void  main(String[] args){

        Stack<Integer> sample=new Stack<>();

        sample.push(1);
        sample.push(2);
        sample.push(3);


        sample.peek();

        System.out.println(sample.peek());


    }
}
