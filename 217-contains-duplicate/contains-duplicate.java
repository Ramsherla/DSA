class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int x:nums){
            set.add(x);
        }
        if(set.size()==nums.length){
            return false;
        }else{
        return true;
        }
        // return true;
        
        
    }
}