// Last updated: 1/5/2026, 11:24:59 PM
class Solution {
    public int singleNumber(int[] nums) {
        int r=0;
       
        for (int i=0;i<nums.length;i++){
            r=r^nums[i];
        }
               return r;
    }
}