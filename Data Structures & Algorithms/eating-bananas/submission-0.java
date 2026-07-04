class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l =1;
        int m =0;
        for(int i=0;i<piles.length;i++){
            m = Math.max(piles[i],m);
        }
        while(l<m){
            int mid = (m+l)/2;
            int time=0;
            for(int i=0;i<piles.length;i++){
                time+=(piles[i]+mid-1)/mid;
            }
            if(time>h){
                l=mid+1;
            }
            else{
                m=mid;
            }
        }
        return m;
    }
}
