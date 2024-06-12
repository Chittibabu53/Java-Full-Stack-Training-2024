import java.util.Arrays;

public class Matrix99 {

    public static void main(String[] args){

        int [][] array={
                {1,2,3},
                {1,2,3},
                {4,3,2},
                {1,2,3}};

        int [][] secondArray={
                {1,2,3,4},
                {1,2,3,4},
                {4,3,2,4}};

        int rows1= array.length;
        int cols1=array[0].length;
        int cols2=secondArray[0].length;

        int [][] mulMatrix=new int[rows1][cols2];

        for(int i=0;i<rows1;i++){
          for(int j=0;j<cols2;j++){
              for(int k=0;k<cols1;k++){
              mulMatrix[i][j]+=array[i][k]*secondArray[k][j];


              }
          }

        }


        for (int [] num:mulMatrix){

            for(int num1:num){
                System.out.print(num1+" ");

            }
            System.out.println();
        }






    }
}
