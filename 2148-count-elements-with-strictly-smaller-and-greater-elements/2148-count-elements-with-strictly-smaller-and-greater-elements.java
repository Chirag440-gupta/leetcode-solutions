class Solution {
    public int countElements(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int s=nums[0];
        int m=nums[n-1];
        int c=0;
        for(int i:nums){
            if(i > s && i < m)
                c++;
        }
        return c;
    }
}