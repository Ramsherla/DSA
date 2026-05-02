class Solution {
    public int[] runningSum(int[] nums) {
        int arr[]=new int[nums.length];
        int prev=nums[0];
        arr[0]=prev;
        for(int i=1;i<nums.length;i++){
            int sum=prev+nums[i];
            prev=sum;
            arr[i]=sum;
        }
        return arr;
        
    }
}