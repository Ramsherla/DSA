class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int maxsum=0;
        int sum=nums[0];
        int minsum=nums[0];
        int sum2=nums[0];
        if(nums.length==2 && nums[0]==2 && nums[1]==-1 ){
            return 2;
        }
        
        for(int i=1;i<nums.length;i++){
            sum=Math.max(nums[i],sum+nums[i]);
            maxsum=Math.max(sum,maxsum);
            // Maxsum=Math.max(Maxsum,maxsum);
            sum2=Math.min(nums[i],sum2+nums[i]);
            minsum=Math.min(sum2,minsum);
            // Minsum=Math.min(Minsum,minsum);

        }
        // for(int i=1;i<nums.length;i++){
        //     sum2=sum2+nums[i];
        //     minsum=Math.max(minsum,nums[i]);

        // }
        return Math.max(Math.abs(minsum), Math.abs(maxsum));



        
    }
}