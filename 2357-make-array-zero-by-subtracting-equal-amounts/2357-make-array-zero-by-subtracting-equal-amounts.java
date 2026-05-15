class Solution {
    public int minimumOperations(int[] nums) {
        int n=nums.length;
        int c=0;
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            if(nums[i]==0) continue;

            c++;
            int v=nums[i];
            while(i<n && nums[i]==v){
                i++;
            }
            i--;
        }
        return c;
    }
}