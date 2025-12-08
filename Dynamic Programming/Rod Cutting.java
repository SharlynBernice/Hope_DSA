INPUT:
4---------------LENGTH OF ROD
1 5 8 9 --------PRICE

OUTPUT:
10

EXPLANATION:
1+1+1+1=4RS
2+2=5RS
3+1=9RS
4=9RS [USE 2D DP ARRAY]

CODE:

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        int n=z.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=z.nextInt();
        }
        int[][] dp=new int[n+1][n+1];
        int max=0;
        dp[0][0]=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i+j>n){
                    dp[i][j]=-1;
                }
                else{
                    int sum=arr[i-1]+arr[j-1];
                    dp[i][j]=sum;
                    max=Math.max(sum,max);
                }
            }
        }
        System.out.print(max);
    }
}
