// Last updated: 6/23/2026, 9:46:02 AM
1class Solution {
2    public int maximumWealth(int[][] accounts) {
3        int ans = 0;
4        for (int[] i : accounts) {
5            int sum = 0;
6            for (int j : i) {
7                sum += j;
8            }
9            ans = Math.max(ans, sum);
10        }
11        return ans;
12    }
13}  