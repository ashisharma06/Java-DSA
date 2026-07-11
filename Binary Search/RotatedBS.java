public class RotatedBS {
    public static void main(String[] args) {
       int[] arr = {4,5,6,7,0,1,2};
       int target = 0;
       int ans = RBS(arr, target);
       System.out.println(ans);
    }


   static int RBS(int[] arr, int target) {
    int start = 0;
    int end = arr.length - 1;

    while (start <= end) {
        int mid = start + (end - start) / 2;

        if (arr[mid] == target) {
            return mid;
        }

        // Left half is sorted
        if (arr[start] <= arr[mid]) {

            if (target >= arr[start] && target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        // Right half is sorted
        else {

            if (target > arr[mid] && target <= arr[end]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
    }
    return -1;
}

    // static int search(int[] nums, int target) {
    //     int pivot = findPivot(nums);

    //     // if you not have a pivot, it means the array is not rotated
    //     if (pivot == -1) {
    //         // just do normal binary search
    //         binarySearch(nums, target, 0, nums.length - 1);
    //     } 
    //     // if pivot has found, you have found 2 ascending sorted arrays
    //     if (nums[pivot] == target) {
    //         return pivot;
    //     }

    //     if (target >= nums[0]) {
    //         return binarySearch(nums, target, 0, pivot - 1);
    //     }

    //     return binarySearch(nums, target, pivot + 1, nums.length - 1);
    // }

    // static int binarySearch(int[] arr, int target, int start, int end) {
    //     while (start <= end) {
    //         // find the middle element
    //         // int mid = ( start + end ) / 2; might be possible that (start + end) exceed the range of in in java
    //         int mid = start + ( end - start ) / 2;
    //         if (target < arr[mid]) {
    //             end = mid - 1;
    //         } else if (target > arr[mid]) {
    //             start = mid + 1;
    //         } else {
    //             // ans found
    //             return mid;
    //         }
    //     }
    //     return -1;
    // }


    // static int findPivot(int[] arr) {
    //     int start = 0;
    //     int end = arr.length - 1;

    //     while (start <= end) {
    //         int mid = start + (end - start) / 2;
    //         // 4 cases over here
    //         if (mid < end && arr[mid] > arr[mid + 1]) {
    //             return mid;
    //         }
    //         if (mid > start && arr[mid] < arr[mid - 1]) {
    //             return mid - 1;
    //         }
    //         if (arr[mid] <= arr[start]) {
    //             end = mid - 1;
    //         } else {
    //             start = mid + 1;
    //         }

    //     }
    //     return -1;
    // }
}
