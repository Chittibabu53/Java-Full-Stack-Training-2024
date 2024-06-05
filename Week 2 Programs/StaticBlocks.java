



public class StaticBlocks {
    static int num;

    static String father;

    static {
        num=88;
        father="my father";
    }


    public  static void  main (String[]args){
        System.out.println(num);
        System.out.println(father);
    }

}
