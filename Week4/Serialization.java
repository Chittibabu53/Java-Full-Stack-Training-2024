import java.io.Serializable;

public class Serialization implements Serializable {

    private String name;

    private int id;


    public Serialization(String name,int id){
        this.name=name;
        this.id=id;

    }

    public String toString(){
        return  name+"  "+id;
    }

}
