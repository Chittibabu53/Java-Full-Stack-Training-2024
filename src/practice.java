import java.util.Scanner;

public class practice {


    public static void main (String []args){

        dog obj=new dog();

        Scanner sc=new Scanner(System.in);

        System.out.println("please enter the number :");
        int numb=sc.nextInt();

        obj.execute();

        if(numb==1) {

            obj.speak();

        }
        else{
            obj.dogbark();
        }


    }

}
