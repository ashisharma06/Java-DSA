public class Main {
    public static void main(String[] args) {
        int[] nums = {45, 2, 3, 345, 0, 9, -1, 23, 45,4};
        int target = -1;
        int ans = linearSearch(nums, target);
        System.out.println(ans);
    }

    // search the target and return true or false
    static boolean linearSearch3(int[] arr, int target) {
        if (arr.length == 0) {
            return false;
        }
        
        // run a for loop
        for (int element : arr) {
            if (element == target) {
                return true;
            }
        }
        // this line will execute if none of the return statements above have executed
        // hence the target not found
       System.out.print("Element does not exist ");
       return false;
    } 


    static int linearSearch2(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        
        // run a for loop
        for (int element : arr) {
            if (element == target) {
                return element;
            }
        }
        // this line will execute if none of the return statements above have executed
        // hence the target not found
       System.out.print("Element does not exist ");
       return Integer.MAX_VALUE;
    } 
    
    
    // search in the array : return the index if item found, if not found return -1
    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return Integer.MAX_VALUE;
        }

        // run a for loop
        for (int index = 0; index < arr.length; index++) {
            // check for element at every if it is = target
            int element = arr[index];
            if (element == target) {
                System.out.print("Element found at index : ");
                return index;
            }
        }
        // this line will execute if none of the return statements above have executed
        // hence the target not found
       System.out.print("Element does not exist ");
       return Integer.MAX_VALUE;
    } 
}
