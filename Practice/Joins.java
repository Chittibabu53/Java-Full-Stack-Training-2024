public class Joins {

    public static void main(String [] args){

        int [][] array1= {
                {1,2,3},
                {3,4,5,},
                {6,7,8}
        };

        int [][] array2={
                {1,2,3,},
                {3,4,5},
                {3,4,5}
        };

//        int rows1=array1.length;
//
//        int cols1=array1[0].length;
//
//        int col2=array2[0].length;
//
//        int [][] result =new int[rows1][col2];
//
//        if(rows1==col2){
//
//            for(int i=0;i<rows1;i++){
//                for(int j=0;j<col2;j++){
//                    for(int k=0;k<cols1;k++){
//                        result[i][j]+=array1[i][k]*array2[k][j];
//                    }
//                }
//            }
//
//
//        }
//
//        for(int [] num:result){
//            for(int num1:num){
//                System.out.print(num1+"\t");
//            }
//            System.out.println();
//        }

        int n=array1.length;

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int temp=array1[i][j];
                array1[i][j]=array1[j][i];

                array1[j][i]=temp;
            }


        }


        for(int i=0;i<n;i++){
            for(int j=0;j<n/2;j++){

                int temp=array1[i][i];

                array1[i][j]=array1[i][n-1-j];
                array1[i][1-n-j]=temp;
            }


        }

        for(int [] num:array1){
            for(int num1:num)
            {
                System.out.println(num1);
            }
        }


    }
}
