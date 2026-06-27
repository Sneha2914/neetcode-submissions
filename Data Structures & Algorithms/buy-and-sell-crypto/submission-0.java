class Solution {
    public int maxProfit(int[] prices) {
        int maxPft = 0;
        for(int i=0; i< prices.length; i++){
            for(int j = i+1; j< prices.length; j++){
                maxPft = Math.max(maxPft, prices[j]-prices[i]);
            }
        }
        return maxPft;
    }
}
