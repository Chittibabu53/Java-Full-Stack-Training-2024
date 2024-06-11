class Money1{

 static void myMoney(){
        System.out.println("My money is in money bank");
    }
}
class Buyers extends Money1{

 static void  myMoney(){
        System.out.println("it is buyers money");
    }

}


public class MethodHiding{

    public static void  main (String[] args){

//        Money.myMoney();
//        Buyers.myMoney();


        Money1 obj=new Buyers();
        Buyers obj2=new Buyers();


        obj.myMoney();

        obj2.myMoney();

    }


}