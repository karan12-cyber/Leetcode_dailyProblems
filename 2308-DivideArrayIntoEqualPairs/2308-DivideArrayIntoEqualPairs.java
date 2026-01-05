// Last updated: 1/5/2026, 11:23:41 PM
import java.util.Arrays;

class Solution {
    public boolean divideArray(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i += 2) {
            if (nums[i] != nums[i + 1]) return false;
        }
        return true;
    }
}