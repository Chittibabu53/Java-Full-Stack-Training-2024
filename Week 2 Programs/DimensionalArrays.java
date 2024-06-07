
import java.util.Scanner;
    public class DimensionalArrays {
        public static void main(String[] args) {
            int[][] arr = new int[3][3];
            Scanner sc = new Scanner(System.in);
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print("Enter Element");
                    arr[i][j] = sc.nextInt();
                    System.out.println();
                }
            }
            System.out.println("Printing Elements...");
            for (int i = 0; i < 3; i++) {
                System.out.println();
                for (int j = 0; j < 3; j++) {
                    System.out.print(arr[i][j] + "\t");
                }
            }
        }
    }


//public class DimensionalArrays{
//
//    public static void main(String[] args){
//
//        int [][] array={{1,2,3,4,5}, {5,4,3,2,1}, {9,8,7,6,5},{1,2,3,4,5}};
//
//        for (int i=0;i<array.length;i++){
//            System.out.println();
//            for(int j=0;j<array[i].length;j++){
//
//                System.out.print(" "+i+","+j);
//
//            }
//
//        }
//    }
//}