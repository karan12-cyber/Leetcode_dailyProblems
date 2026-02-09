// Last updated: 2/9/2026, 10:08:18 AM
1class Solution {
2    public int majorityElement(int[] nums) {
3        int count = 0;
4        int candidate = 0;
5
6        for (int num : nums) {
7            if (count == 0) {
8                candidate = num;
9            }
10            count += (num == candidate) ? 1 : -1;
11        }
12        return candidate;
13    }
14}
15