// Last updated: 2/2/2026, 9:44:23 AM
1class Solution {
2    public int[] searchRange(int[] nums, int target) {
3        int first = findBound(nums, target, true);
4        int last = findBound(nums, target, false);
5        return new int[]{first, last};
6    }
7
8    private int findBound(int[] nums, int target, boolean isFirst) {
9        int left = 0, right = nums.length - 1;
10        int bound = -1;
11
12        while (left <= right) {
13            int mid = left + (right - left) / 2;
14
15            if (nums[mid] == target) {
16                bound = mid;
17                if (isFirst) {
18                    right = mid - 1; // move left
19                } else {
20                    left = mid + 1;  // move right
21                }
22            } 
23            else if (nums[mid] < target) {
24                left = mid + 1;
25            } 
26            else {
27                right = mid - 1;
28            }
29        }
30        return bound;
31    }
32}
33