class Solution {
    public int mirrorDistance(int n) {
        int temp=n;
        String sum="";
        String str=Integer.toString(temp);
        for(int i=str.length()-1;i>=0;i--){
            sum+=str.charAt(i);

        }
        int isum=Integer.parseInt(sum);
        return Math.abs(isum-n);
        
    }
}