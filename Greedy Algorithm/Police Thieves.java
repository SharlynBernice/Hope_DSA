an array of size N. 
Which has the following specifications: Each element in the array contains either a policeman or a thief. 
Each policeman can catch only one thief. 
A policeman cannot catch a thief who is more than K units away from him. 
We need to find the maximum number of thieves that can be caught.

Input Format

6
P
T
P
T
T
P
3

Output Format

Maximum thieves caught: 3

CODE:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner z=new Scanner(System.in);
        int n=z.nextInt();
        char[] arr=new char[n];
        for(int i=0;i<n;i++){
            arr[i]=z.next().charAt(0);
        }
        int k=z.nextInt();
        ArrayList<Integer> p=new ArrayList<>();
        ArrayList<Integer> t=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(arr[i]=='P'){
                p.add(i);
            }
            else{
                t.add(i);
            }
        }
        int plen=p.size();
        int tlen=t.size();
        int pi=0;
        int tj=0;
        int count=0;
        while(pi<plen && tj<tlen){
            if(Math.abs(p.get(pi)-t.get(tj))<=k){
                count++;
                pi++;
                tj++;
            }
            else if(p.get(pi)<t.get(tj)){
                pi++;
            }
            else if(p.get(pi)>t.get(tj)){
                tj++;
            }
        }
        System.out.println("Maximum thieves caught: "+count);
    }
}
  
