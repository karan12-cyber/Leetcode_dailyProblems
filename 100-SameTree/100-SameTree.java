// Last updated: 2/13/2026, 9:51:58 AM
1class Solution {
2    public boolean isSameTree(TreeNode p, TreeNode q) {
3        
4        // If both nodes are null, trees are same
5        if (p == null && q == null) {
6            return true;
7        }
8        
9        // If one is null and other is not, trees are different
10        if (p == null || q == null) {
11            return false;
12        }
13        
14        // If values are different, trees are different
15        if (p.val != q.val) {
16            return false;
17        }
18        
19        // Recursively check left and right subtrees
20        return isSameTree(p.left, q.left) && 
21               isSameTree(p.right, q.right);
22    }
23}
24