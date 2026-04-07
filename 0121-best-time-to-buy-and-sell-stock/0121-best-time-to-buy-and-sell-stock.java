class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length==0) return 0;
        int buy=prices[0];
        int mp=0;
        int n=prices.length;
        for(int i=1;i<n;i++){
            buy=Math.min(buy,prices[i]);
            mp=Math.max(mp,prices[i]-buy);
        }
        return mp;
    }
}