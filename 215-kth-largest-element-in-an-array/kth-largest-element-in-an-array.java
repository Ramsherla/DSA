class Solution {
    public int findKthLargest(int[] nums, int k) {
        int val=0;
        PriorityQueue q=new PriorityQueue<>(Comparator.reverseOrder());
        for(int i=0;i<nums.length;i++){
            q.add(nums[i]);

        }
        for(int j=0;j<k;j++){
             val=(int)q.poll();
        }
        return val;
        
    }
}