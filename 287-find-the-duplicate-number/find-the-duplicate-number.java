class Solution {
    public int findDuplicate(int[] nums) {
        int number=0;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
            number++;
            if(number!=set.size()){
                return nums[i];
            }
        }
        return 0;

        
    }
}