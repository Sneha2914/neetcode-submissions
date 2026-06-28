class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(b[0]*b[0] + b[1]*b[1], a[0]*a[0] + a[1]*a[1]));
        for(int[] point : points){
            int x= point[0];
            int y= point[1];
            pq.offer(point);
        }
        while(pq.size()>k){
            pq.poll();
        }
        int[][] result = new int[k][2];
        int i = 0;
        while(!pq.isEmpty()){
            result[i++] = pq.poll();
        }
        return result;

    }
}
