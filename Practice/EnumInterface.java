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
}

public class EnumInterface {

    public static void main(String[] args) {


        for(Currency num:Currency.values()){
            System.out.println(num);
        }

    }
}
