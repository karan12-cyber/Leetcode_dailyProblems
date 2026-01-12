// Last updated: 1/12/2026, 9:14:43 PM
1class Solution {
2    static int maxNorm(int[] P, int[] Q){
3        return Math.max(Math.abs(P[0]-Q[0]), Math.abs(P[1]-Q[1]));
4    }
5    static public int minTimeToVisitAllPoints(int[][] points) {
6        int ans=0;
7        int[] prev=points[0];
8        for (int[] P: points){
9            ans+=maxNorm(P, prev);
10            prev=P;
11        }
12        return ans;
13    }
14}