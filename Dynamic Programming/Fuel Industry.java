INPUT:
n=5, k=105
price=[10,10,40,50,90]
volume=[10,20,20,50,150]



OUTPUT:
<must print the max volume of fuel that can be bought with the given budget>
170

NOTE: construct a 2D DP ARRAY with i values as volume,price and j values as budget splitted in 10(0,10,20,30....100)


CODE:

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner z=new Scanner(System.in);
		int n=z.nextInt();
		int k=z.nextInt();
		int[] price=new int[n];
		int[] vol=new int[n];
		for(int i=0;i<n;i++){
		    price[i]=z.nextInt();
		}
		for(int i=0;i<n;i++){
		    vol[i]=z.nextInt();
		}
		int[][] dp=new int[n+1][k+1];
		for(int i=1;i<=n;i++){
		    for(int j=0;j<=k;j+=10){
		        if(price[i-1]<=j){
		            dp[i][j]=Math.max(dp[i-1][j],vol[i-1]+dp[i-1][j-price[i-1]]);
		        }
		        else{
		            dp[i][j]=dp[i-1][j];
		        }
		    }
		}
		int cap=(k/10)*10;
		System.out.print(dp[n][cap]);
	}
}

