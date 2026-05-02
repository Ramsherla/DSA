class Solution {
    public int[] shuffle(int[] nums, int n) {
        boolean b=true;
        int arr[]=new int[2*n];
        int Lidx=0;
        int Ridx=0;
        for(int i=0;i<2*n;i++){
            if(b){
                arr[i]=nums[Ridx];
                Ridx++;
                b=false;
            }else{

                arr[i]=nums[n+Lidx];
                Lidx++;
                b=true;
            }
        }
        return arr;
        
    }
}