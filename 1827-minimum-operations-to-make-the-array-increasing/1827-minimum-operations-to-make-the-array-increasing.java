class Solution {
    public int minOperations(int[] nums) {
        int ans = 0;
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i + 1] <= nums[i]){
                int temp = nums[i] - nums[i + 1] + 1;
                nums[i + 1] += temp;
                ans += temp;
            }
        }
        return ans;
    }
}