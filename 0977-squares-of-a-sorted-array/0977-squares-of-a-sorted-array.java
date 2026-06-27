class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int []sqr=new int[n];

        int l=0,r=n-1,i=n-1;
        while(l<=r){
            int ls=nums[l]*nums[l];
            int rs=nums[r]*nums[r];

            if(ls>rs){
                sqr[i]=ls;
                l++;
            } else{
                sqr[i]=rs;
                r--;
            }
            i--;
        }
        return sqr;
    }
}