class Solution {
    public boolean isUgly(int n) {
        if(n<=0) return false;
        int []p={2,3,5};
        for(int ap: p){
            while(n%ap==0) n=n/ap;
        }
        return n==1;
    }
}