You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security systems connected and it will automatically contact the police if two adjacent houses were broken into on the same night.

Given an integer array nums representing the amount of money of each house, return the maximum amount of money you can rob tonight without alerting the police.

 

Example 1:

Input: nums = [1,2,3,1]
Output: 4
Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
Total amount you can rob = 1 + 3 = 4.
Example 2:

Input: nums = [2,7,9,3,1]
Output: 12
Explanation: Rob house 1 (money = 2), rob house 3 (money = 9) and rob house 5 (money = 1).
Total amount you can rob = 2 + 9 + 1 = 12.


CODE:

METHOD 1: USING TABULATION

class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        int[] dp=new int[n+1];
        dp[0]=0;
        dp[1]=nums[0];
        for(int i=2;i<=n;i++){
            dp[i]=Math.max(dp[i-1],nums[i-1]+dp[i-2]);
        }
        return dp[n];
    }
}


METHOD 2: USIND MEMOIZATION AND RECURSION

class Solution {

    public int fun(int[] nums, int n, int[] dp){
        if(n < 0) return 0;
        if(n == 0) return nums[0];

        if(dp[n] != -1) return dp[n];

        int take = nums[n] + fun(nums, n - 2, dp);
        int notTake = fun(nums, n - 1, dp);

        return dp[n] = Math.max(take, notTake);
    }

    public int rob(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);

        return fun(nums, n-1, dp);
    }
}

