class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans=new int[nums.length*2];
        for(int i=0;i<nums.length;i++){
            ans[i]=nums[i];
        }
        int n=nums.length;
         for(int i=0;i<nums.length;i++){
            
            ans[n]=nums[i];
            n++;
        }
        return ans;
    }
}