class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
        int n=nums.length;
        Arrays.sort(nums);
        int[] ans=new int[k];
        int c=0;
        for(int i=n-1;i>=0 && c<k; i--){
           if(i==n-1 || nums[i]!=nums[i+1]){
            ans[c++]=nums[i];
           }
        }
        return Arrays.copyOf(ans,c);
    }
}