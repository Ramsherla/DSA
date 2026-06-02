class Solution {
    public void sortColors(int[] nums) {
        int zeros[]=new int[nums.length];
        int ones[]=new int[nums.length];
        int twos[]=new int[nums.length];
        int x=0,z=0,y=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                zeros[x++]=nums[i];
            }else if(nums[i]==1){
                ones[y++]=nums[i];
            }else{
                twos[z++]=nums[i];
            }
        }
        for(int i=0;i<x;i++){
            nums[i]=0;
        }
        for(int i=x;i<y+x;i++){
            nums[i]=1;
        }
        for(int i=y+x;i<nums.length;i++){
            nums[i]=2;
        }
        

        
    }
}