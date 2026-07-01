//leetcode.com/problems/git push/description/
public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = { 12, 345, 2, 6, 7896, 00 };
        System.out.println(FindNumbers(nums));
        System.out.println(digits(0));
    }

    static int FindNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }

    // funtion to check weather a number contains even digit or not
    static boolean even(int num) {
        int numberofDigits = digits(num);
        if (numberofDigits % 2 == 0) {
            return true;
        }
        return false;
    }

    // count number of digits in a number
    static int digits(int num) {
        if (num < 0) {
            num = num * -1;
        }
        if (num == 0) {
            return 1;
        }
        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }
}



