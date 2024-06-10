public class MatrixSearch {
    public static int[] searchMatrix(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int target = 5;
        int[] result = searchMatrix(matrix, target);
        if (result[0] != -1) {
            System.out.println("Element found at row " + result[0] + ", column " + result[1]);
        } else {
            System.out.println("Element not found");
        }
    }
}
