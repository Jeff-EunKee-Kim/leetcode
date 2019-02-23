class Solution {
    public int[][] kClosest(int[][] points, int K) {
        PriorityQueue<int[]> q = new PriorityQueue<>((a, b) -> (a[0]*a[0] + a[1]*a[1]- b[0]*b[0] -b[1]*b[1]));
        for (int[] p : points){
            q.add(p); 
        }
        int[][] ans = new int[K][2]; 
        int count = 0; 
        while(!q.isEmpty() && count < K){
            ans[count++] = q.remove();
        }
        return ans;
    }
}