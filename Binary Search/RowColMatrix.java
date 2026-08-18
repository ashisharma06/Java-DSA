import java.util.Arrays;

public class RowColMatrix {
    public static void main(String[] args) {
        int[][] arr = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {28, 29, 37, 49},
            {33, 34, 38, 50}
        };

        System.out.println(Arrays.toString(search(arr, 37 )));
    }

    static int[] search(int[][] matrix, int target){
        int row = 0;
        int col = matrix.length - 1;
        while (row < matrix.length && col >= 0) {
            // Case 1: to check is the current element in which we are now is the target
            if(matrix[row][col] == target) {
                return new int[] {row, col};
            }
            // Case 2: to check if element it greater than the target
            if(matrix[row][col] > target) {
                col--;
            } else{
                row++;
            }
        }
        return new int[] {-1, -1};
    }
}
