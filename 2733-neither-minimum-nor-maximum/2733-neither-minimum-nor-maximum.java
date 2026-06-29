class Solution {
    public int findNonMinOrMax(int[] nums) {
        int n=nums.length;
       
        int min=nums[0],max=nums[0];

        if(n<-3) return -1;
        for(int m:nums){
            min=Math.min(min,m);
        }
        for(int ma:nums){
            max=Math.max(max,ma);
        }
        for(int i=0;i<n;i++){
            if(nums[i]!=min && nums[i]!=max) return nums[i];

        }

        return -1;
    }
}