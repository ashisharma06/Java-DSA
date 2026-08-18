public class RotatedBSRotation {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5};
        System.out.println("Number of rotations " + numberofRotation(arr));
    }

    static int numberofRotation(int[] arr) {
        int pivot = findpivot(arr);

        if (pivot == -1) {
            return 0;
        } else {
           return pivot + 1;
        }
    }

    static int findpivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Case1
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            
            // Case2
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            if (arr[start] <= arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
