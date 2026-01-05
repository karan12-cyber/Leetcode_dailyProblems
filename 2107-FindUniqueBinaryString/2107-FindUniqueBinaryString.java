// Last updated: 1/5/2026, 11:23:49 PM
class Solution {
    public String findDifferentBinaryString(String[] nums) {
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i].charAt(i) == '0') {
                ans.append('1');
            } else {
                ans.append('0');
            }
        }
        return ans.toString();
    }
}