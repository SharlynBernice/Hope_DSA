Sample Input 0

2
5 7
0 1
0 4
1 2
1 3
1 4
2 3
3 4
3 3
0 1
1 2
2 0
Sample Output 0

0-> 1-> 4
1-> 0-> 2-> 3-> 4
2-> 1-> 3
3-> 1-> 2-> 4
4-> 0-> 1-> 3
0-> 1-> 2
1-> 0-> 2
2-> 1-> 0



CODE:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner z=new Scanner(System.in);
        int t=z.nextInt();
        while(t-->0){
            int v=z.nextInt();
            int e=z.nextInt();
            ArrayList<ArrayList<Integer>> list=new ArrayList<>();
            for(int i=0;i<v;i++){
                list.add(new ArrayList<>());
            }
            for(int i=0;i<e;i++){
                int sv=z.nextInt();
                int ev=z.nextInt();
                list.get(sv).add(ev);
                list.get(ev).add(sv);
            }
            for(int i=0;i<v;i++){
                System.out.print(i+"-> ");
                for(int j=0;j<list.get(i).size();j++){
                    if(j<list.get(i).size()-1){
                       System.out.print(list.get(i).get(j)+"-> "); 
                    }
                    else{
                        System.out.print(list.get(i).get(j));
                    }
                }
                System.out.println();
            }
        }
    }
}
