class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> q=new PriorityQueue<>();
        for(int i=0;i<stones.length;i++){
            q.add(-stones[i]);

            
        }
        while(q.size()>1){
            int x1=q.poll();
            int x2=q.poll();
            if(x1!=x2){
                q.add(x1-x2);
            }
        }
        return q.isEmpty()?0:q.peek()*-1;
        
    }
}