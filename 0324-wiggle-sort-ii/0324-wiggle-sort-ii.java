class Solution {
    public void wiggleSort(int[] nums) {
        int n=nums.length;
        int[] arr=nums.clone();
        Arrays.sort(arr);

        int l= (n-1)/2;
        int r=n-1;

        for(int i=0;i<n;i++){
            if(i%2==0){
                nums[i]=arr[l--];
            } else {
                nums[i]=arr[r--];
            }
        }
    }
}