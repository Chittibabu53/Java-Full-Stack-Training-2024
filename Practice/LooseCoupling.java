interface  Actionable{

    void performAction();

}

class Bn implements Actionable{

    @Override
    public void performAction() {
        System.out.println("b is performed");
    }
}
class An {

    private Actionable actionable;


    An(Actionable actionable){
        this.actionable=actionable;
    }

    public void doSomething(){
        actionable.performAction();
    }
}


public class LooseCoupling {

    public static void main(String[] args) {

        Actionable classb=new Bn();
        An classA=new An(classb);

        classA.doSomething();

    }
}
