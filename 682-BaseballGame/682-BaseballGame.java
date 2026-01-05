// Last updated: 1/5/2026, 11:24:48 PM
class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        int sum  = 0;
        for (String op : operations) {
            if (op.equals("C")) {
                stack.pop(); 
            } else if (op.equals("D")) {
                stack.push(stack.peek() * 2);
            } else if (op.equals("+")) {
                int top = stack.pop();
                int newTop = top + stack.peek();
                stack.push(top);
                stack.push(newTop);
            } else {
                stack.push(Integer.parseInt(op));
            }
        }

        for(int k : stack) sum+=k;
        return sum;
    } 
}