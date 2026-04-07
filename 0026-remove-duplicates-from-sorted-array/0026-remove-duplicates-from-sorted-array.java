class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        int slw=0;
        for(int i=1;i<n;i++){
            if(nums[i]!=nums[slw]){
                slw++;
                nums[slw]=nums[i];
            }
        }
        return slw+1;
    }
}