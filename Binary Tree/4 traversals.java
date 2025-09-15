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
    InOrder( root);
    System.out.println();
    PreOrder( root);
    System.out.println();
    PostOrder(root);
    System.out.println();
    printLevelOrder(root);
        
        
    }
     static void InOrder(Node root) {
        if (root == null) return;
             InOrder(root.left);
             System.out.print(root.data+" ");
             InOrder(root.right);
         
    }
    static void PostOrder(Node root) {
        if (root == null) return;
        
             PostOrder(root.left);
            
             PostOrder(root.right);
         System.out.print(root.data+" ");
         
    }
     static void printLevelOrder(Node root) {
        if (root == null) return;

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int size = q.size();

            for (int j = 0; j < size; j++) {
                Node curr = q.poll();
                System.out.print(curr.data + " ");

                if (curr.left != null) q.add(curr.left);
                if (curr.right != null) q.add(curr.right);
            }
           
        }
     }
         static void PreOrder(Node root) {
        if (root == null) return;
             
        System.out.print(root.data+" ");
             PreOrder(root.left);
             PreOrder(root.right);
         
    }
}
