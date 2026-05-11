class Solution {
    public int minOperations(int[] nums) {
        int n=nums.length;
        if(nums.length==1) return 0;
        int c=0;

        for(int i=1;i<n;i++){
            if(nums[i]<=nums[i-1]){
                int d=(nums[i-1]-nums[i])+1;
                nums[i]=nums[i]+d;
                c+=d;
            }
        }
        return c;
    }
}