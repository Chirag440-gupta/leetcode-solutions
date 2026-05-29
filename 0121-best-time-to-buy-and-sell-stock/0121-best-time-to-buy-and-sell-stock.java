class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int buy=prices[0];
        int mp=0;
        for(int i=1;i<n;i++){
            buy=Math.min(buy,prices[i]);
            mp=Math.max(mp,prices[i]-buy);
        }
        return mp;
    }
}