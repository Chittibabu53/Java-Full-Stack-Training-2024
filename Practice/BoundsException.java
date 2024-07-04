class ThrowExcep extends RuntimeException{

    ThrowExcep(String s){
        super(s);
    }
//  static   void key() throws Exception{
//        throw new Exception("jimmy");
//    }


    public static void main(String args[])
    {
        int age =16;
        if(age<17){
            throw new ThrowExcep("age not met");
        }
//
//        try {
//            key();
//        }
//        catch (Throwable e){
//           e.printStackTrace();
//        }


    }
}
