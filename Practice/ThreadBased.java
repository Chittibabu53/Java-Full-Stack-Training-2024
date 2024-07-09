public class ThreadBased {

    public static void main(String[] args) {

        int k = 0; // Start k from 1 to begin with the sequence 1 2 3 4 5 0

//        for (int line = 0; line < 5; line++) {
//            for (int i = 0; i < 6; i++) {
//
//                System.out.print((line+i)%6+" ");
//
//            }
//            System.out.println();
//        }




//        for(int i=0;i< array.length;i++){
//
//            array[i]=array[i]*array[i];
//
//            System.out.print(array[i]+" ");
//        }
//        int temp=0;
//        int sum=array[0]+array[1]+array[2];
//
//        for(int i=3;i< array.length;i++){
//
//            System.out.println(sum);
//            sum = sum + array[i] - array[i-3];
//
//
//        }
//        System.out.println(sum);

//
//    int [] array={1,2,3,4,5,6,7,8,9,10,11,12};
//
//
//    int lenth=array.length-1;
//
//    int logic=9;
//    int count=0;
//        count=lenth;
//
//    while (count!=0) {
//
//        if (logic >lenth) {
//
//            if(lenth!=0){
//                lenth--;
//            }
//            else{
//                lenth++;
//            }
//
//            count++;
//
//        if(count==logic){
//                System.out.println(array[lenth]);
//                break;
//            }
//
//        } else {
//            System.out.println(array[logic]);
//            break;
//        }
//    }
//

        int num=232;

        int sum=0;

        int temp=num;
        while (num>0){

            int r=num%10;

            sum=(sum*10)+r;

            num=num/10;

        }
        System.out.println(temp==sum);



        int a=11;

        System.out.println(234%100);
        System.out.println(234/100);







    }
}
