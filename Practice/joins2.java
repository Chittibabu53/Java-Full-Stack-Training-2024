import java.util.Arrays;

public class joins2 {
    public static void main(String[] args) {

        int [][] array1= {
                {1,2,3},
                {3,4,5,},
                {6,7,8}
        };


        int top=0;

        int bottom= array1.length-1;

        int left=0;
        int right= array1[0].length-1;


        while (top<=bottom && left<=right){


            for(int i=left;i<=right;i++){
                System.out.println(array1[top][i]+" ");
            }
            top++;


            for (int i=top;i<=bottom;i++){
                System.out.println(array1[i][right]);
            }

            right--;



            if(top<=bottom){

                for(int i=right;i>=left;i--){
                    System.out.println(array1[bottom][i]);
                }
                bottom--;

            }

            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    System.out.println(array1[i][left]);
                }
            }
            left++;
        }




        int [] home= {1,2,4,6,9,8,7};

        Arrays.sort(home);

        System.out.println(Arrays.toString(home));
    }

}
