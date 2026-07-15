class Solution {
    public int distinctAverages(int[] nums) {
        Arrays.sort(nums);
        HashSet<Integer> set=new HashSet<>();
        int n=nums.length;
        int i=0;
        int j=n-1;
        while(i<j){
            set.add(nums[i]+nums[j]);
            i++;
            j--;
        }
        return set.size();
    }
}