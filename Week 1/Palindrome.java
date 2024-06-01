
public class Palindrome {

    public static void  main (String []args) {

        String value="lool";
        String result=ispalindrome(value)? "it is palindrome":"it is not palindrome";
        System.out.println(result);

    }
    public static boolean ispalindrome(String value){
        int first=0;
        int last=value.length()-1;

        while (first<last){
            if(value.charAt(first) !=value.charAt(last)){
                return false;
            }
            first++;
            last--;

        }
        return  true;
    }



}
