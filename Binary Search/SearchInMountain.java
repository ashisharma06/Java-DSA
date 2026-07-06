public class SearchInMountain {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 3, 1};
    int target = 3;
    System.out.println(search(arr, target));
}

static int search(int arr[], int target) {
    int peak = peakIndexMountainArray(arr);
    int firstTry = orderDiagnosticBS(arr, target, 0, peak);
    if (firstTry != -1) {
        return firstTry;
    }
    // try to search in the second half
    return orderDiagnosticBS(arr, target, peak + 1, arr.length - 1);
}

static int peakIndexMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                // you are in decreasing part of an array
                // this might be the answer
                end = mid;
            } else {
                // you are in ascending part of an array
                start = mid + 1;
            }
        }
        return start;
    }

    static int orderDiagnosticBS(int[] arr, int target, int start, int end) {

        // find weather the array is sorted in ascending or desending
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

        }

        return -1;
    }
}
