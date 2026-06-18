import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // arrays of primitives
        // int[] arr = new int[5];
        // arr[0] = 23;
        // arr[1] = 45;
        // arr[2] = 344;
        // arr[3] = 7;
        // arr[4] = 89;
        // [23,45,344,7,89]
        // System.out.println(arr[3]);
        // System.out.println(arr[5]); index out of bound error


        // input using for loops
        // for (int i=0; i < arr.length; i++) {
        //     arr[i] = input.nextInt();
        // }

        // System.out.println(Arrays.toString(arr));

        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i] + " ");   
        // }

        // for(int num : arr) { // for every element in array, print element 
        //     System.out.print(num + " "); // here num represents element of the array
        // }

        // arrays of objects
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = input.next();
        }
        System.out.println(Arrays.toString(str));
        
        //modify
        str[1] = "Ashish";
        System.out.println(Arrays.toString(str));
    }
}
