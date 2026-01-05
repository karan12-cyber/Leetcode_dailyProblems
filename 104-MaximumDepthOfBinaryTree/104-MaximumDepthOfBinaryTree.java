// Last updated: 1/5/2026, 11:25:01 PM

class Solution {
    public int maxDepth(TreeNode root) {
        return height(root);
    }
    private int height(TreeNode root){
        if(root == null) return 0;
        int ld = height(root.left);
        int rd = height(root.right);
        return Math.max(ld, rd)+1;
    }
}
       
    
