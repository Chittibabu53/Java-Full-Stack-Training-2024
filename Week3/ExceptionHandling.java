public class ExceptionHandling {

    static void key(){

        try{
           throw new NullPointerException ("demo");

        }
        catch (NullPointerException e){
            System.out.println(e.getMessage());

            throw e;
        }

    }

    public static void main(String[] args){

        try{
            key();
        }
        catch (NullPointerException e){
            System.out.println("caught in main");
            System.out.println(e.getMessage());

            System.out.println(e.toString());
        }


    }
}
