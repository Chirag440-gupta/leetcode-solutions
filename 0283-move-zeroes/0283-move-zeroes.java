class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int slw=0;
        for(int fst=0;fst<n;fst++){
            if(nums[fst]!=0){
                nums[slw]=nums[fst];
                slw++;
            }
        }
        while(slw<n){
            nums[slw]=0;
            slw++;
        }
        // return nums;
    }
}