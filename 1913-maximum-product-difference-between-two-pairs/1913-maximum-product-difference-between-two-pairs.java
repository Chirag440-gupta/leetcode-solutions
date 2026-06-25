class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int m1=0;
        int m2=0;
        // for(int i=0;i<n;i++){
            m1=nums[0]*nums[1];
            m2=nums[n-1]*nums[n-2];
        // }
        return m2-m1;
    }
}