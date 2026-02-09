// Last updated: 2/9/2026, 9:37:48 AM
1import java.util.PriorityQueue;
2
3class Solution {
4    public int findKthLargest(int[] nums, int k) {
5        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
6
7        for (int num : nums) {
8            minHeap.offer(num);
9
10            if (minHeap.size() > k) {
11                minHeap.poll(); // remove smallest
12            }
13        }
14
15        return minHeap.peek(); // kth largest
16    }
17}
18