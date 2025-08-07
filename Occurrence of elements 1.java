import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        int n=z.nextInt();
        int[] arr=new int[n];
        int max=0;
        for(int i=0;i<n;i++){
            arr[i]=z.nextInt();
        }
        for(int num:arr){
            if(num>max){
                max=num;
            }
        }
        int[] freq=new int[max+1];
        for(int i:arr){
            freq[i]++;
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]!=0){
                System.out.print(freq[i]+" ");
            }
        }
    }
}
