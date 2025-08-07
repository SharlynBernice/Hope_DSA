#QUESTION
Input Format

The first line contains a single integer n (4 ≤ n ≤ 20), representing the number of elements in the array.

The second line contains n space-separated integers.

9
2 1 3 2 2 5 8 9 8

Constraints

4 ≤ n ≤ 20
-100 ≤ array[i] ≤ 100
INPUT: [-2 1 0] 
OUTPUT: 
-2 - 1
0 - 1
1 - 1
    
Output Format

For each unique stone type, print the stone number, followed by a hyphen (-), then the count of how many times it appeared.

Output should be sorted by the stone number in ascending order.
1 - 1
2 - 3
3 - 1
5 - 1
8 - 2
9 - 1

#CODE: 
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        int n=z.nextInt();
        int[] arr=new int[n];
        int max=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            arr[i]=z.nextInt();
        }
        for(int num:arr){
            if(num>max){
                max=num;
            }
            if(num<min){
                min=num;
            }
        }
        int m=max;
        min=Math.abs(min);
        int[] freq=new int[max+min+1];
        for(int i:arr){
            freq[i+min]++;
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]!=0){
                System.out.println(i-min+" - "+freq[i]);
            }
        }
    }
}
