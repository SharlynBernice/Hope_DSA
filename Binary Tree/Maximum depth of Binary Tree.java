Input: root = [3,9,20,null,null,15,7]
Output: 3


Input: root = [1,null,2]
Output: 2

CODE:

class Solution {
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
      //method 1
        int l=maxDepth(root.left);
        int r=maxDepth(root.right);
        int max=(l>r)?l:r;
        return 1+max;
      //method 2
        return 1+Math.max(maxDepth(root.left),maxDepth(root.right));
    }
}
