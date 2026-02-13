// Last updated: 2/13/2026, 10:10:58 AM
1class Solution {
2    public TreeNode invertTree(TreeNode root) {
3        
4        // Base case
5        if (root == null) {
6            return null;
7        }
8        
9        // Swap left and right children
10        TreeNode temp = root.left;
11        root.left = root.right;
12        root.right = temp;
13        
14        // Recursively invert left and right subtrees
15        invertTree(root.left);
16        invertTree(root.right);
17        
18        return root;
19    }
20}
21