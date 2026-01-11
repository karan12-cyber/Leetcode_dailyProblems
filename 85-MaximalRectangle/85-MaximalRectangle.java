// Last updated: 1/11/2026, 10:39:16 PM
1
2class Solution {
3    private int largestRectangle(int[] h) {
4        Stack<Integer> st = new Stack<>();
5        int n = h.length, max = 0;
6
7        for (int i = 0; i <= n; i++) {
8            int cur = (i == n ? 0 : h[i]);
9            while (!st.isEmpty() && h[st.peek()] > cur) {
10                int height = h[st.pop()];
11                int width = st.isEmpty() ? i : i - st.peek() - 1;
12                max = Math.max(max, height * width);
13            }
14            st.push(i);
15        }
16        return max;
17    }
18
19    public int maximalRectangle(char[][] matrix) {
20        if (matrix.length == 0) return 0;
21        int m = matrix.length, n = matrix[0].length;
22        int[] height = new int[n];
23        int ans = 0;
24
25        for (int i = 0; i < m; i++) {
26            for (int j = 0; j < n; j++)
27                height[j] = matrix[i][j] == '1' ? height[j] + 1 : 0;
28            ans = Math.max(ans, largestRectangle(height));
29        }
30        return ans;
31    }
32}
33
34