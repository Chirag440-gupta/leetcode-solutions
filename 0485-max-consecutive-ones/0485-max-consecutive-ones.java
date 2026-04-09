class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n=nums.length,c=0,m=0;
        for(int i=0;i<n;i++){
            if(nums[i]==1){
                c++;
            } else {
                m=Math.max(m,c);
                c=0;
            }
        }
        return Math.max(m,c);
    }
}