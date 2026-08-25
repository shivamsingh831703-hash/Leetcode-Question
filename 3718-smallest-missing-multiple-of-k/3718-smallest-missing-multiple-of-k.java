class Solution {
    public int missingMultiple(int[] nums, int k) {
         Arrays.sort(nums);
        int mul = k;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == mul){
                mul += k;
            }
        }
        return mul;
    }
}