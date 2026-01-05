// Last updated: 1/5/2026, 11:24:50 PM
class Solution {
    int d =0;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null) return 0;
        height(root);
        return d;
    }
    int height (TreeNode root){
        if(root == null) return 0;
        int l = height(root.left);
        int r = height(root.right);
        d= Math.max(d,l+r);
        return Math.max(l,r)+1;
    }
}
