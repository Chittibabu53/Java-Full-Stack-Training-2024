

class BankAccount{

    double balance;

    public BankAccount(double balance ){
        this.balance=balance;

    }

    public double CalculateInterest(){
         return  balance*0.1;

    }

}

 class SavingAccount extends  BankAccount{

    public SavingAccount(double balance){
        super(balance);
    }

    public double  CalculateInterest (){
        return balance *0.2;
    }

}
class CurrentAccount extends SavingAccount{


 public CurrentAccount(double balance){

     super (balance);

 }


    public double  CalculateInterest (){
        return balance *0.4;
    }

}





public class Overriding{


    public static void main (String[] args){


        SavingAccount savingAccount=new SavingAccount(2222.00);
        CurrentAccount currentAccount=new CurrentAccount(222.00);


        System.out.println(savingAccount.CalculateInterest());
        System.out.println(currentAccount.CalculateInterest());





    }

}