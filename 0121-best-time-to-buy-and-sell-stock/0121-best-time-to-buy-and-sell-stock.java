class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int buy=prices[0];
        int sell=0;
        int p=0;
        int ans=0;
        for(int i=0;i<n;i++){
           if(buy>prices[i]){
            buy=prices[i];
           }
           else if(buy<prices[i]){
            sell=prices[i];
            p=sell-buy;
            ans=Math.max(ans,p);
           }
        }
        return ans;
    }
}