class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int sum=0;
        int nth=0;
        for(int i=cost.length-1;i>=0;i--){
            nth++;
            if(nth!=3){
                sum+=cost[i];
                
            }else{
                nth=0;
            }
        }
        return sum;
        
    }
}