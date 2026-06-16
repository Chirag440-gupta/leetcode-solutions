class Solution {
    public int maxProduct(int[] nums) {
        int i=0,j=0;
        for(int n:nums){
            if(n>i){
                j=i;;
                i=n;
            } else if(n>j){
                j=n;
            }
        }
        return (i-1)*(j-1);
    }
}