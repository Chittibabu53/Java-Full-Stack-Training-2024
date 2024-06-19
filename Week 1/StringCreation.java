import javax.script.ScriptEngine;

public class StringCreation {

    public static void main (String [] args){
        String Name="lokesh";

        String yourName="lokesh"+"is my name";

        String othersName=new String("subhash");

        System.out.println(Name);
        System.out.println(yourName);
        System.out.println(othersName);

        //using string constructor

        char[] array={'s','u','b','b','u'};

        String create=new String(array);
        System.out.println(create);

        //concatenation

        String firstName="hello";
        String secondName="world";

        String fullName=firstName+""+secondName;
        System.out.println(fullName);




    }
}
