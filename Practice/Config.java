class SuperConfig{


    SuperConfig()
    {
        System.out.println("superconfigb group");
    }
}


public class Config extends SuperConfig {


    Config(){
        System.out.println("config group");
    }

    Config(String s){

    }



    public static void main (String[] args){
//        new Config();


    }



}

