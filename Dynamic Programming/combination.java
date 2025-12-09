INPUT:
N=4
arr=[A,B,C,D]              //this array is not needed as we only need to find the number of cominations 
                          //but if they ask to print all tthe combinations then we need that array

OUTPUT:
10

NOTE: construct a 1D DP ARRAY , they can participate either singley or in pairs.

CODE:
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner z=new Scanner(System.in);
		int n=z.nextInt();
		int[] dp=new int[n+1];
		dp[0]=0;                //base condition
		dp[1]=1;                //base condition 
		dp[2]=2;                //base condition
		for(int i=3;i<=n;i++){
		    dp[i]=dp[i-1]+(i-1)*dp[i-2];
		}
		System.out.print(dp[n]);
	}
}





  
