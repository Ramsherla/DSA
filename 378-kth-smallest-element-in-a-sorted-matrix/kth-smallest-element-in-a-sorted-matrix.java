class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> q=new PriorityQueue<>();
        for(int i=0;i<matrix[0].length;i++){
            for(int j=0;j<matrix[i].length;j++){
                q.add(matrix[i][j]);
            }
        }
        for(int x=0;x<k-1;x++){
            q.poll();
        }
        return q.peek();
        
    }
}