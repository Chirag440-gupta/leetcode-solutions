class Solution {
    public int buyChoco(int[] prices, int money) {
        int m1=Integer.MAX_VALUE;
        int m2=Integer.MAX_VALUE;

        for(int p:prices){
            if(p<=m1){
                m2=m1;
                m1=p;
            } else if(p<=m2){
                m2=p;
            }
        }
            int c=m1+m2;
        if(c<=money){
           return money-c;
        }
        return money;
    }
}