#QUESTION

Input Format

11
2 2 3 4 5 12 2 3 3 3 12

Constraints

5<=n<=20 -100<=a[i]<=100

Output Format

3 3 3 3 2 2 2 12 12 4 5

#CODE

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        Scanner z=new Scanner(System.in);
        int n=z.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=z.nextInt();
        }
        int max=0;
        int min=Integer.MAX_VALUE;
        for(int num:arr){
            if(num>max){
                max=num;
            }
            if(num<min){
                min=num;
            }
        }
        min=Math.abs(min);
        max=max+min+1;
        int[] freq=new int[max];
        for(int i:arr){
            freq[i+min]++;
        }
        int mx=0;
        int midx=0;
        for(int k=0;k<max;k++){
            
        for(int i=0;i<max;i++){
            if(freq[i]>mx){
               mx=freq[i];
               midx=i; 
            }
        }
            for(int j=0;j<mx;j++){
                System.out.print(midx-min+" ");
            }
        freq[midx]=0;
        mx=0;
        }
    }
}
