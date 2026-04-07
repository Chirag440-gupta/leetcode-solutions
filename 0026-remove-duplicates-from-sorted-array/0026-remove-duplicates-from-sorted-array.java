class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        int slw=0;
        for(int fst=1;fst<n;fst++){
            if(nums[fst]!=nums[slw]){
                slw++;
                nums[slw]=nums[fst];
            }
        }
        return slw+1;
    }
}