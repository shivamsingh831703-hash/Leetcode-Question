class Solution {
    public void moveZeroes(int[] nums) {
     int temp = 0;
     for(int i = 0;i<nums.length;i++){
        if(nums[i]!=0){
            int j = nums[temp];
            nums[temp] = nums[i];
            nums[i] = j;
            temp++;
        }
    
     }
    }
}