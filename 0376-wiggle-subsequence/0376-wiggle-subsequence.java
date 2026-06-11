class Solution {
    public int wiggleMaxLength(int[] nums) {
        int u=1;
        int d=1;
        int n=nums.length;
        for(int i=1;i<n;i++){
            if(nums[i]> nums[i-1]){
                u=d+1;
            } else if(nums[i]<nums[i-1]){
                d=u+1;
            }
        }
        return Math.max(u,d);
    }
}