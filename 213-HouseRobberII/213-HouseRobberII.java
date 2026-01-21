// Last updated: 1/21/2026, 10:16:02 AM
1class Solution {
2    public int rob(int[] nums) {
3        return robb(nums);
4    }
5
6    public int robb(int[] houses){
7        int n = houses.length;
8        if(n == 1) return houses[0];
9
10        int[] houses1 = new int[n-1];
11        for(int i=0; i<n-1; i++){
12            houses1[i] = houses[i];
13        }
14        int[] dp1 = new int [n-1];
15        Arrays.fill(dp1, -1);
16
17        int[] houses2 = new int[n-1];
18        for(int i=1; i<n; i++){
19            houses2[i-1] = houses[i];
20        }
21        int[] dp2 = new int[n-1];
22        Arrays.fill(dp2, -1);
23
24        return Math.max(
25            startRob(houses1, houses1.length-1, dp1),
26            startRob(houses2, houses2.length-1, dp2)
27        );
28    }
29    public int startRob(int[] nums,int idx,int[] dp){
30        if(idx < 0) return 0;
31        if(idx==0) return nums[0];
32
33        if(dp[idx] != -1) return dp[idx];
34
35        int pick = nums[idx] + startRob(nums, idx-2, dp);
36        int notPick = startRob(nums,idx-1,dp);
37        return dp[idx] = Math.max(pick,notPick);
38    }
39}