class Solution {
    public int arrangeCoins(int n) {
        int r=1;
        int c=0;
        while(n>=r){
            n=n-r;
            c++;
            r++;
        }
        return c;
    }
}