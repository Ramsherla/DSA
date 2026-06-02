class Solution {
    public int maxProfit(int[] prices) {
        int profite=0,min=prices[0];
        for(int i=1;i<prices.length;i++){
            profite=Math.max(profite,prices[i]-min);
            min=Math.min(min,prices[i]);

        }
        return profite;
        
    }
}