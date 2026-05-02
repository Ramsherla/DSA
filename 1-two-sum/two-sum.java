class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int arr[]=new int[2];
        int idx=0;
        // int AnIdx;
        for(int i=0;i<nums.length;i++){
            int req=target-nums[i];
            if(map.containsKey(req)){
                arr[1]=map.get(req);
                arr[0]=i;
            }else{
                map.put(nums[i],i);
    
            }
        }
        
        return arr;
    }
}