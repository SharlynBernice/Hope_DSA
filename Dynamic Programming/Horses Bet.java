INPUT: 
10 100
10 90 80 20 90 60 40 60 70 75
OUTPUT:
1

CODE:
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        int n=z.nextInt();
        int amt=z.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=z.nextInt();
        }
        int start=0;
        int cSum=0;
        int mSum=0;
        int count=0;
        for(int i=0;i<n;i++){
            cSum+=arr[i];
            if(cSum>=amt){
                cSum-=arr[start];
                start++;
            }
            else{
                count++;
            }
        }
        System.out.print(Math.max(count,mSum));
    }
}
