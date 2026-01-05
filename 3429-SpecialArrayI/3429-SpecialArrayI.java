// Last updated: 1/5/2026, 11:22:55 PM
class Solution {
    public boolean isArraySpecial(int[] nums) {
        // Iterate through the array, checking consecutive pairs
        for (int i = 0; i < nums.length - 1; i++) {
            // If the sum of two consecutive numbers is even, return false
            if ((nums[i] + nums[i + 1]) % 2 == 0) return false;
        }
        // If all pairs have an odd sum, return true
        return true;        
    }
}