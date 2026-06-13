class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int n=nums.length;
        int s=0,e=n-1;
        int[] arr=nums.clone();
        Arrays.sort(arr);

        while(s<n && nums[s]==arr[s]){
            s++;
        } 
        while(e>s && nums[e]==arr[e]){
            e--;
        }
        return e-s+1;
    }
}