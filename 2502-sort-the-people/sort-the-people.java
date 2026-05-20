class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        TreeMap<Integer,String> map=new TreeMap<>(Collections.reverseOrder());
        for(int i=0;i<names.length;i++){
            map.put(heights[i],names[i]);
        }
        int k=0;
        String arr[]=new String[names.length];
        for(int x:map.keySet()){
            arr[k++]=map.get(x);
        }
        return arr;
        
        
    }
}