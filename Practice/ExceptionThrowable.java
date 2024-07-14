class Sup{

    void main() throws Exception{
        ExceptionThrowable.myMethod();

    }



}

public class ExceptionThrowable extends Sup {


    static void myMethod() throws Exception{
        throw new Exception("jimmy");
    }


    public static void main(String[] args)  {



    }
}
