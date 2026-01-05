// Last updated: 1/5/2026, 11:25:14 PM
class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length==0) return 0;
        int i=0;
        for (int j=1;j<nums.length;j++){
            if (nums[j]!=nums[i]){
                i++;
                nums[i] = nums[j];

            }
        }
        return i+1;
        
    }
}