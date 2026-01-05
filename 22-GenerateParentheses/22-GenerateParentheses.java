// Last updated: 1/5/2026, 11:25:16 PM
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> lion = new ArrayList<>();
        a(n, 0, 0, "", lion);
        return lion;
    }

    static void a(int n, int open, int close, String ans, List<String> lion) {
        if (open == n && close == n) {
            lion.add(ans);
            return;
        }
        if (open < n) {
            a(n, open + 1, close, ans + "(", lion);
        }
        if (open > close) {
            a(n, open, close + 1, ans + ")", lion);
        }
    }
}