// Last updated: 1/5/2026, 11:24:53 PM
class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int j=0;
        for (int i=0;i<n;i++){
            if(nums[i]!=0 && nums[j]==0 ){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;

            }
            if(nums[j]!=0){
                j++;

            }
        }
        

        
    }
}