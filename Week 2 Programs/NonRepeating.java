public class NonRepeating {
    public static void  main (String []args){

        int arr[]={1,3,1,6,7,7,8,8,3};



        int checkrepeat=0;

        for(int i=0;i<arr.length;i++){
            int count=1;

            for(int j=0;j< arr.length;j++){
                if(arr[i]==arr[j]&&i!=j){
                 count++;
                 break;
                }

             }
          if(count==1){
              System.out.println(arr[i]);

            }





        }



    }
}
