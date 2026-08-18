public class RotatedBSwihDuplicates {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5};
        int target = 0;
        System.out.println(RotatedBSDuplicate(arr, target));
    }

    static boolean RotatedBSDuplicate(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
 
            // if the target is the middle element
            if (target == arr[mid]) {
                return true;
            }

            // for dupliates
            if (arr[start] == arr[mid] && arr[end] == arr[mid]) {
                if (arr[start] == target) return true;
                start++;

                if (arr[end] == target) return true;
                end--;

                continue;
            }

            // left half sorted
            if (arr[start] <= arr[mid]) {
                if (target >= arr[start] && target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid] && target <= arr[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return false;
    }
}


