class Solution {
    public int maximizeSum(int[] nums, int k) {
        int max=nums[0];
        int s=0;
        for(int x:nums){
            max=Math.max(max,x);
        }
        for(int i=0;i<k;i++){
            s+=max;
            max++;
        }
        return s;
    }
}