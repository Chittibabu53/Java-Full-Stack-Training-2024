public class SamplePractice {
    public static void main(String[] args) {

        int [] array ={1,2,3,4,5,6,7,8,9,};

        for(int i=0;i< array.length;i=i+2){

            System.out.println(array[i]);
        }

        String str=new String("lopllol");
        boolean palindrome=true ;

        int first=0;
        int last=str.length()-1;

        while(first<last) {


            if (str.charAt(first)!=str.charAt(last)) {
                palindrome=false;
                System.out.println("it is not palindrome");
                break;
            }
            first++;
            last--;

        }

        if(palindrome==true){
            System.out.println("it is palindrome");
        }





        for(int i=str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }

        int count=0;
        char target='l';

        System.out.println();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==target){
                count++;
            }
        }
        System.out.println(count);

        String input =new String("abc");


        int num=10;
        int num2=11;
        int num3=12;



        boolean value= num2<num? true: false;
        System.out.println(value);

        int result =(num>num2)&&num>num3? num:(num2>num3)? num2:num3 ;

        System.out.println(result);

        int a=20, b=30, c=40 ,result1;

        result1= ((a>b)?a>c? a:c : (b>c)? b:c);

        System.out.println(result1);


    }
    static  void runj(){
        

    }
}
