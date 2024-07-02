public class NewSpiral {

    public static void main(String[] args) {
        int[][] matrix = {
                {5, 2, 3},
                {4, 9, 6},
                {7, 8, 9}
        };

//        for(int i=0; i<matrix.length;i++){
//            for(int j=i;j< matrix.length;j++){
//                int temp=matrix[i][j];
//
//                matrix[i][j]=matrix[j][i];
//
//                matrix[j][i]=temp;
//
//            }
//        }
//
//
//
//
//        for(int i=0;i< matrix.length;i++){
//            for(int j=0;j< matrix.length/2;j++){
//
//                int temp=matrix[i][j];
//
//                matrix[i][j]=matrix[i][matrix.length-1-j];
//
//                matrix[i][matrix.length-1-j]=temp;
//
//            }
//        }
//
//
//
//        for(int num[]:matrix){
//            System.out.println();
//            for(int num1:num){
//                System.out.print(num1+"\t");
//            }
//        }


     int [][] matrix2={
             {1,56,3},
             {5,3,4},
             {9,4,5}
     };



        int rows1=matrix.length;
        int cols1=matrix[0].length;
        int cols2=matrix2[0].length;
        int [][] result=new int [rows1][cols2];


        if(cols1==matrix2.length){

            for(int i=0;i<rows1;i++){
                for(int j=0;j<cols2;j++){
                    for(int k=0;k<cols1;k++){

                    result[i][j]+= matrix[i][k]*matrix2[k][j];

                }
                }
            }
        }
        else{
            System.out.println("rows1 not equal to cols2");
        }



        for(int num1[]:result){
            System.out.println();
            for(int num:num1){
                System.out.print(num+"\t");
            }
        }


        System.out.println();
        int top=0;
        int bottom=matrix.length-1;
        int left=0;
        int right=matrix[0].length-1;



        while(top<=bottom &&left<=right){

            for(int i=left;i<=right;i++){
                System.out.println(matrix[top][i]);
            }
            top++;

            for(int j=top;j<=bottom;j++){
                System.out.println(matrix[j][right]);
            }
            right--;


            if(top<=bottom){

                for(int i=right;i>=left;i--){
                    System.out.println(matrix[bottom][i]);
                }
                bottom--;
            }

            if(left<=right){

                for(int i=bottom;i>=top;i--){
                    System.out.println(matrix[i][left]);
                }


                left++;
            }


        }


    }




}
