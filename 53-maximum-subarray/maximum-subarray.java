class Solution {
    public int maxSubArray(int[] nums) {
        int CurrentMax=nums[0];
        int TotalMax=nums[0];
        if(nums.length<=1){
            return nums[0];
        }
        
        for(int i=1;i<nums.length;i++){
            int sum=CurrentMax+nums[i];
            CurrentMax=Math.max(sum,nums[i]);
            TotalMax=Math.max(TotalMax,CurrentMax);

        }
        return TotalMax;
        
    }
}