class Parent {

    void run(){
        System.out.println("i am parent");
    }

}
class Child extends Parent{

    void run(){
        System.out.println("i am class");
    }
}


public class RunTimePolymorphism {

    public static void main(String[]args){

        Parent parent;
        Parent child;

         parent=new Parent();
         child=new Child();

        parent.run();
        child.run();


    }
}
