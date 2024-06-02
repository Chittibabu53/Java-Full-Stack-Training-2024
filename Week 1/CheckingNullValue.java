public class CheckingNullValue {

    public static void  main (String[] args){

        String str = null;

        String result = (str != null) ? str : "Default Value";
        System.out.println("The string is: " + result);

    }
}
