class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int buy1=Integer.MIN_VALUE;
        int buy2=Integer.MIN_VALUE;

        int sell1=0;
        int sell2=0;
        for(int num: prices){
            buy1=Math.max(buy1, -num);
            sell1=Math.max(sell1, buy1 + num);

            buy2=Math.max(buy2, sell1- num);
            sell2=Math.max(sell2, buy2 + num);
        }
        return sell2;
    }
}