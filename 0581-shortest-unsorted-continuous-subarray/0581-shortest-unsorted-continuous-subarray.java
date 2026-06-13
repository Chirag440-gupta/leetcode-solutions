class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int n=nums.length;
        int max=Integer.MIN_VALUE;
        int s=-1,e=-1;
        for(int i=0;i<n;i++){
            max=Math.max(max,nums[i]);

            if(nums[i]<max) e=i;
        }
        int min=Integer.MAX_VALUE;
        for(int i=n-1;i>=0;i--){
            min=Math.min(min,nums[i]);

            if(nums[i]>min) s=i;

        }
        return e==-1 ? 0 : e-s+1;
    }
}