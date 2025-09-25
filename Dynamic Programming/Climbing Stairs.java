
You are climbing a staircase. It takes n steps to reach the top.
Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

  
Example 1:

Input: n = 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps

Example 2:

Input: n = 3
Output: 3
Explanation: There are three ways to climb to the top.
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step


CODE:

METHOD 1:  USING ITERATION 

class Solution {
    public int climbStairs(int n) {
        int[] dp=new int[n+1];
        if(n<=2){
            return n;
        }
        dp[1]=1;
        dp[2]=2;
        for(int i=3;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
}

METHOD 2:   USING RECUSRSION

class Solution {
    public int sc(int n,int[] dp){
        if(dp[n]!=0){
            return dp[n];
        }
        dp[n]=sc(n-1,dp) + sc(n-2,dp);    //memoization 
        return dp[n];
    }
    public int climbStairs(int n) {
        int[] dp=new int[n+1];
        if(n<=2){
            return n;
        }
        dp[1]=1;
        dp[2]=2;
        
        return sc(n,dp);
    }
}
