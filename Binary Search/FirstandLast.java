//leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
public class FirstandLast {
    public static void main(String[] args) {
        int[] arr = {5,7,7,7,7,8,8,10};
        int target = 11;
        
        int first = search(arr, target, true);
        int last = search(arr, target, false);
        
        System.out.println("The first occurance is : " + first);
        System.out.println("The last occurance is : " + last);
        
    }
    
    static int[] searchRange (int[] arr, int target){
        int[] ans = {-1, -1};
        
        int start = search(arr, target, true);
        int end = search(arr, target, false);
        
        ans[0] = start;
        ans[1] = end;
        
        return ans;
    }
    
    static int search(int[] arr, int target, boolean isStartIndex) {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;
        
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }  else {
                ans = mid;
                if (isStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
