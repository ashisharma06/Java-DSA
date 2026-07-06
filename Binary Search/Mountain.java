public class Mountain {
    public static void main(String[] args) {
        int[] arr = {7,8,9,6,5,4,3};
        System.out.println(peakIndexMountainArray(arr));
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
}
