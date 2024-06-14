import java.io.IOException;

public class ThrowsExample {



        public static void main(String[] args) {
            try{
                throwException();
            }
            catch(Exception e){

            }

        }

        public static void throwException() throws Exception {


            int a=10/0;

            throw  new IOException();
//            try {
//                int a=0/10;
//            } catch (Exception t) {
//                System.out.println("Caught a Throwable: " + t.getMessage());
//                t.printStackTrace();
//            }
        }
    }





