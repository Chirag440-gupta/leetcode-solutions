class Solution {
    public int countElements(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int s=Integer.MAX_VALUE;
        int m=Integer.MIN_VALUE;
        int c=0;
        for(int min:nums){
            s=Math.min(s,min);
        }
        for(int max:nums){
           m=Math.max(m,max);
        }
        for(int i:nums){
            if(i > s && i < m) c++;
        }
        return c;
    }
}