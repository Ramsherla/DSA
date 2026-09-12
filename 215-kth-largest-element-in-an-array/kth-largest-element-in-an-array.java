class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> q=new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
            q.add((-1)*nums[i]);
        }
        for(int i=0;i<k-1;i++){
            q.poll();
        }
        return q.poll()*-1;


        
    }
}