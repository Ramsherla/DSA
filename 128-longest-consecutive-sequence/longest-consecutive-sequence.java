class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        // if(nums.length==1)
        //     return 1;
        TreeSet<Integer> set=new TreeSet<>();
        int c=1;
        int prev=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int k=0;
        for(int x:set){
            if(k==0){
                k++;
                max=Math.max(c,max);
                prev=x;
            }else{
                if(prev+1==x){
                    c++;
                    max=Math.max(c,max);
                    
                }else{
                    c=1;
                }
                prev=x;
            }
            
        }
        return max;
    }
}