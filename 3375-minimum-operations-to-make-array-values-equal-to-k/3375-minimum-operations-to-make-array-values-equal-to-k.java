class Solution {
    public int minOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int count = 0;
        int prev = -1;
        for(int num : nums){
            if(num < k){
                return -1;
            }
            if(num > k && num != prev){
                count++;
                prev = num;
            }
        }
        return count;
    }
}