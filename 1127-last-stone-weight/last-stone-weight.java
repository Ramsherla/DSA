class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> q=new PriorityQueue<>(Comparator.reverseOrder());
        for(int i=0;i<stones.length;i++){
            q.add(stones[i]);
        }
        while(q.size()>1){
            int s1=(int)q.poll();
            int s2=(int)q.poll();
            if(s1-s2!=0){
                q.add(s1-s2);
            }
        }
        if(q.isEmpty()){
            return 0;
        }
        return (int)q.poll();
        
    }
}