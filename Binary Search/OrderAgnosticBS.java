public class OrderAgnosticBS {
    public static void main(String[] args) {
        int arr[] = {-18, -4, 0, 2, 15, 34, 90};
        int target = 34;
        int ans = orderDiagnosticBS(arr, target);
        System.out.println(ans);
    }

    static int orderDiagnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

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
