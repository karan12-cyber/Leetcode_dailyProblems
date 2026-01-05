// Last updated: 1/5/2026, 11:24:46 PM
class Solution {
    public int[] dailyTemperatures(int[] tem) {
        int n  = tem.length;
        int [] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i<n;i++){
            while(!st.isEmpty() && tem[st.peek()]<tem[i]){
                int k = st.pop();
                ans[k]= i-k;
            }
            st.push(i);
        }
        return ans;
    }
}