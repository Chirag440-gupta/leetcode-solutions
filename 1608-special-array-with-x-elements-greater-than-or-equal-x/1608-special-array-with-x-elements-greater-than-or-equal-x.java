class Solution {
    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;

        for(int i=0;i<n;i++){
            int c=n-i;
            if(nums[i]>=c && (i==0 || nums[i-1] < c)){
                return c;
            }
        }
        return -1;
    }
}