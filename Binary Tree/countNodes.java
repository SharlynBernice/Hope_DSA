import java.io.*;
import java.util.*;

class Node{
    int data;
    Node left;
    Node right;
    public Node (int data){
        this.data=data;
        
    }
}
public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    
        Queue <Node> q=new LinkedList<>();
        Node root = null;
        int num=sc.nextInt();
       if(num!=-1){
        
             root = new Node(num);
             q.add(root);
        }
        while(!q.isEmpty()){
            Node qPoped=q.poll();
          
            num=sc.nextInt();
                if(num!=-1){
                    Node nn=new Node(num);
                    q.add(nn);
                    qPoped.left=nn;
                }
            
                num=sc.nextInt();
                if(num!=-1){
                     Node nn=new Node(num);
                     q.add(nn);
                   qPoped.right=nn;
                }
            
        }
    System.out.print(count(root));
    }
    public static int count(Node root){
        if(root==null){
            return 0;
        }
        return 1+count(root.left)+count(root.right);
    }
}
