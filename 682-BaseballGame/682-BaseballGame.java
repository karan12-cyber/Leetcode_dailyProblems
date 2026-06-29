// Last updated: 6/29/2026, 9:12:24 AM
1class Solution {
2    public int calPoints(String[] operations) {
3        Stack<Integer> stack = new Stack<>();
4        int sum  = 0;
5        for (String op : operations) {
6            if (op.equals("C")) {
7                stack.pop(); 
8            } else if (op.equals("D")) {
9                stack.push(stack.peek() * 2);
10            } else if (op.equals("+")) {
11                int top = stack.pop();
12                int newTop = top + stack.peek();
13                stack.push(top);
14                stack.push(newTop);
15            } else {
16                stack.push(Integer.parseInt(op));
17            }
18        }
19
20        for(int k : stack) sum+=k;
21        return sum;
22    } 
23}