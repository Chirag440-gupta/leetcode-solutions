class Solution {
    public int maxSum(int[] nums) {
        HashSet<Integer> set= new HashSet<>();
        int s=0;
        int m=Integer.MIN_VALUE;
        for(int x:nums){
            m=Math.max(m,x);
            if(x>0 && !set.contains(x)){
                s+=x;
                set.add(x);
            }
        }
        return s > 0 ? s:m;
    }
}