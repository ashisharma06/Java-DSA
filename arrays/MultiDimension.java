import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        /*
         * 1 2 3
         * 4 5 6
         * 7 8 9
         */
        Scanner input = new Scanner(System.in);
        // int[][] arr = new int[3][]; // adding column is not mandatory

        // int[][] arr2D = {
        // {1,2,3},
        // {4,5,6},
        // {7,8,9}
        // };

        // int[][] arr = {
        // {1,2,3}, // 0th index
        // {4, 5}, // 1st index
        // {6, 7, 8} // 2nd index -> ar2D[1] = {6, 7, 8}
        // };

        int[][] arr = new int[3][3];
        System.out.println(arr.length); // This will give me number of row's

        // input
        for (int row = 0; row < arr.length; row++) {
            // for each col in every row
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = input.nextInt();
            }
        } 

        // output
        for (int row = 0; row < arr.length; row++) {
            // for each col in every row
            for (int col = 0; col < arr[row].length; col++) {
                // System.out.print(arr[row][col] + " ");
            }
             System.out.println();
        } 


        // output
        // for (int row = 0; row < arr.length; row++) {
        //     System.out.println(Arrays.toString(arr[row]));
        // }

        for(int[] a : arr) {
            System.out.println(Arrays.toString(a));
        }
    }
}
