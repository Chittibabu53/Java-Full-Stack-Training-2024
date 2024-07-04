public class Sample7 {
    static int   xy=0;
    int x=0;
 static  void execute(){

   }

   int kkk;

    public static void main(String[] args) {

     Sample7 obj=new Sample7();

        System.out.println( obj.kkk);

     for(int i=0;i<5;i++){

         if(i==0||i==4){
             System.out.println();
             for(int j=0;j<5;j++){
                 System.out.print("*"+"\t");
             }

         }

         else{
             System.out.println();
            for(int k=0;k<=5;k++){
                if(k==0||k==5){
                    System.out.print("*");
                }
                else{
                    System.out.print("\t");
                }
            }
         }
     }

    }
}
