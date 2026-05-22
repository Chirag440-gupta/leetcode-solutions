class Solution {
    public int maximizeSum(int[] nums, int k) {
        int n=nums.length;
        int s=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(max<nums[i]){
                max=nums[i];
            }
        }
        for(int i=0;i<k;i++){
            s+=max;
            max++;
        }
        return s;
    }
}