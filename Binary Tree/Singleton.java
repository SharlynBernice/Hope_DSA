import java.io.*;
import java.util.*;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
public class Solution {
    public static void sib(Node root){
        if(root==null){
            return;
        }
        if(root.left!=null && root.right==null){
            System.out.print(root.left.data+" ");
        }
        if(root.left==null && root.right!=null){
            System.out.print(root.right.data+" ");
        }
        sib(root.right);
        sib(root.left);
    }
    public static void main(String[] args) {
        Scanner z=new Scanner(System.in);
        int val=z.nextInt();
        Node root=null;
        Queue<Node> q=new LinkedList<>();
        if(val!=-1){
            root=new Node(val);
            q.add(root);
        }
        while(!q.isEmpty()){
            Node pop=q.poll();
            int num=z.nextInt();
            if(num!=-1){
                Node nn=new Node(num);
                q.add(nn);
                pop.left=nn;
            }
            num=z.nextInt();
            if(num!=-1){
                Node nn=new Node(num);
                q.add(nn);
                pop.right=nn;
            }
        }
        sib(root);
    }
    
}
