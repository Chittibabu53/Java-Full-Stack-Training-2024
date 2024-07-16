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


   Currency c1=Currency.nicky;
        System.out.println(c1.getRate());

        for(Currency num:Currency.values()){
            System.out.println(num);
        }

    }
}
