You are given an integer array coins representing coins of different denominations and an integer amount representing a total amount of money.
Return the fewest number of coins that you need to make up that amount. If that amount of money cannot be made up by any combination of the coins, return -1.
You may assume that you have an infinite number of each kind of coin.

 
Example 1:

Input: coins = [1,2,5], amount = 11
Output: 3
Explanation: 11 = 5 + 5 + 1
  
Example 2:

Input: coins = [2], amount = 3
Output: -1
  
Example 3:

Input: coins = [1], amount = 0
Output: 0



CODE:

METHOD 1: USING 1D DP ARRAY:

class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp=new int[amount+1];
        Arrays.fill(dp,amount+1);
        dp[0]=0;
        for(int i=1;i<=amount;i++){
            for(int c:coins){
                if(i-c>=0){
                    dp[i]=Math.min(dp[i],1+dp[i-c]);
                }
            }
        }
        if(dp[amount]<=amount){
            return dp[amount];
        }
        else{
            return -1;
        }
    }
}


METHOD 2: USING 2D DP ARRAY:

class Solution {
    public int coinChange(int[] coins, int amount) {
        int n=coins.length;
        int[][] dp=new int[n+1][amount+1];
        for(int[] row:dp){
            Arrays.fill(row,amount+1);
        }
        for(int i=0;i<=n;i++){
            dp[i][0]=0;
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=amount;j++){
                if(j>=coins[i-1]){
                    dp[i][j]=Math.min(dp[i-1][j],1+dp[i][j-coins[i-1]]);
                }
                else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        int ans=dp[n][amount];
        return ans==amount+1 ? -1 : ans;
    }
}
