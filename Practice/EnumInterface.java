enum Currency{

    lok(1),
    subbu("subbu"),
    mahesh("djidjd"),
    nicky(4.5),
    ricky(5);

    private Object rate;

    Currency(Object rate){
        this.rate=rate;
    }
    public Object getRate() {
        return rate;
    }
}

public class EnumInterface {

    public static void main(String[] args) {

//        for(Currency color:Currency.values()){
//            System.out.println(color);
//        }
//
//        Currency var=Currency.mahesh;

//        switch (var){
//            case lok -> System.out.println("lok observed");
//            case subbu -> System.out.println("subbu observed");
//            case mahesh -> System.out.println("mahesh observed");
//            default -> System.out.println("nothing oserveded");
//        }


         String word="Jimson";

         for(int i=0;i<=2*word.length();i++){
             if(i<=word.length()){
                 System.out.println(word.substring(0,i));
             }
             else{
                 int n=i-word.length();
                 System.out.println(word.substring(0,word.length()-n));
             }
         }
    }
}
