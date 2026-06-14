class Solution {
    public int dominantIndex(int[] nums) {
        int n=nums.length;
        int max=nums[0];
        int ans=0;
        for(int i=0;i<n;i++){
            if(nums[i]>max){
                max=nums[i];
                ans=i;
            }
        }
        for(int i=0;i<n;i++){
            if(i==ans) continue;
            if(max< 2*nums[i]) {
            return -1;
        }
        }
        return ans;
    }
}