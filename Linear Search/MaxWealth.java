// leetcode.com/problems/richest-customer-wealth/ 
public class MaxWealth {
    public static void main(String[] args) {
        
    }

    public int maximumWealth(int[][] accounts) {
        // Here person is row
        int ans = Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length; person++) {
            // Here account is coloumn,iterating through every coloumn through each row 
            int sum = 0;
            for (int account = 0; account < accounts[person].length; account++) {
                sum += accounts[person][account];
            }
            // now we have sum of accounts of person
            // chacking with overall anser
            if(sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }
}
