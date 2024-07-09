public  class Multithreading1  {


    public static void main(String[] args) throws Exception {

        try{
            for(int i=0;i<10;i++){
                Thread.sleep(1000);
                System.out.println(i);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}