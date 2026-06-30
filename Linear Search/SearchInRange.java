public class SearchInRange {
    public static void main(String[] args) {
        int[] nums = { 7, 9, 3, 2, 76, 5, 9, 10 };
        int target = 22;
        System.out.println(linearSearch(nums, target, 1, 4));
    }

    static int linearSearch(int[] nums, int target, int start, int end) {
        if(nums.length == 0) {
            return -1;
        }

        for(int index = start; index <= end; index++) {
            int element = nums[index];
            if (element == target) {
                return index;
            }
        }
        System.out.println("Element does not exist");
        return -1;
    }
}
