class Solution {
    public int maximizeSum(int[] nums, int k) {
        int max=nums[0];
        for(int x:nums){
            max=Math.max(max,x);
        }
        return max*k + (k*(k-1))/2;
    }
}