public class Matrixr {

    public static void main (String[] args){

        int [][]array= {
                {1,2,3,},
                {4,5,6,},
                {7,8,9,}
        };

        int top = 0;
        int bottom = array.length - 1;
        int left = 0;
        int right = array[0].length - 1;

        while(top<=bottom &&left<=right){

            for(int i=left;i<=right;i++){
                System.out.println(array[top][i]+" ");
            }
            top++;


            for(int i=top;i<=bottom;i++){
                System.out.println(array[i][right]);
            }

            right--;


            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    System.out.println(array[bottom][i]);
                }
                bottom--;
            }

            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    System.out.println(array[i][left]);
                }
                left++;

            }


        }

    }
}