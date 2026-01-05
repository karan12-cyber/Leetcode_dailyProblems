// Last updated: 1/5/2026, 11:25:11 PM
class Solution {
    public int searchInsert(int[] nums, int target) {
        for (int i=0;i<nums.length;i++){
            if (nums[i]==target){
                return i;
            }
           else if (nums[i]>target){
            return i;

            }
        }
             return nums.length;
        }        
}  
 
