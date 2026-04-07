class Solution {
    public int majorityElement(int[] nums) {
        if(nums.length==0) return 0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            int j=0;
            for(int k=0;k<n;k++){
                if(nums[k]==nums[i]){
                j++;
            }
        }
            if(j>n/2){
                return nums[i];
            }
        }
        return -1;
    }
}