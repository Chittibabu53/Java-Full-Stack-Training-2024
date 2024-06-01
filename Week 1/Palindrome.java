
public class Palindrome {

    public static void  main (String []args) {

        String check="6666";
        String reverseCheck="";

        for (int i=(check.length())-1;i>=0;i--){

            reverseCheck+=check.charAt(i);

        }
        System.out.println(reverseCheck);

    }



}
