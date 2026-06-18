import java.util.Arrays;

public class PassinginFunctions {
    public static void main(String[] args) {
        // Arrays are mutable objects; since 'nums' and 'arr' point to the same reference in the heap, 
        // modifying the element here directly changes the original array in the main method.
        int[] nums = {3,4,5,6};
        System.out.println(Arrays.toString(nums));
        change(nums); 
        System.out.println(Arrays.toString(nums));
    }
    
    static void change(int[] arr) {
        arr[0] = 99;
    }
}
