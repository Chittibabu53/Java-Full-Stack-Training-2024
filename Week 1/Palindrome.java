
public class Palindrome {

    public static void  main (String []args) {

        String value="lol";

        if(ispalindrome(value)){
            System.out.println(value+" is palindrome");
        }
        else{
            System.out.println(value+" is not palindrome");
        }

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
