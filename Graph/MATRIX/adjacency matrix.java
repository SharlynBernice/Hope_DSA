Input Format

First line:
An integer V — the number of vertices in the graph.
Second line:
An integer E — the number of edges.
Third line:
A string — "yes" if the graph is directed, "no" if the graph is undirected.
Next E lines:
Each line contains three integers: u v w, denoting an edge from node u to node v with weight w.

5
6
no
0 1 1
1 4 1
2 4 1
0 2 1
3 4 1
0 3 1

Constraints

1 ≤ V ≤ 100
0 ≤ E ≤ V*(V-1)
0 ≤ u, v < V
0 ≤ w ≤ 100
The graph may have self-loops (i.e., u == v is allowed).

Output Format

Print the V x V adjacency matrix.
Each row should contain V space-separated integers.
If there is no edge between two vertices, the value should be 0.

0 1 1 1 0
1 0 0 0 1
1 0 0 0 1
1 0 0 0 1
0 1 1 1 0

Sample Input 0

5
6
no
0 1 1
1 4 1
2 4 1
0 2 1
3 4 1
0 3 1
Sample Output 0

0 1 1 1 0
1 0 0 0 1
1 0 0 0 1
1 0 0 0 1
0 1 1 1 0
Explanation 0

The graph is undirected, so every edge u v w implies both matrix[u][v] = w and matrix[v][u] = w.

The matrix represents edge weights; 0 means no edge.

For instance, the edge 0 1 1 creates both matrix[0][1] = 1 and matrix[1][0] = 1.




CODE:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner z=new Scanner(System.in);
        int v=z.nextInt();
        int e=z.nextInt();
        z.nextLine();
        String str=z.next();           //here if we use z.nextLine() it gives error
        int[][] grid=new int[v][v];
        for(int i=0;i<e;i++){
            int sv=z.nextInt();
            int ev=z.nextInt();
            int w=z.nextInt();
            if(str.equalsIgnoreCase("yes")){
                grid[sv][ev]=w;
            }
            else{
                grid[sv][ev]=w;
                grid[ev][sv]=w;
            }
        }
        for(int i=0;i<v;i++){
            for(int j=0;j<v;j++){
                System.out.print(grid[i][j]+" ");
            }
            System.out.println();
        }
    }
}
