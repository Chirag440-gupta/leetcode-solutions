class Solution {
    public int maxProductDifference(int[] nums) {
        int n=nums.length;
      int min1=Integer.MAX_VALUE;
      int min2=Integer.MAX_VALUE;

      int max1=Integer.MIN_VALUE;
      int max2=Integer.MIN_VALUE;
      
      int m1=0;
      int m2=0;

      for(int i=0;i<n;i++){
        if(nums[i]<min1){
            min2=min1;
            min1=nums[i];
        }else if(nums[i] < min2 ){
            min2=nums[i];
        }
      }

       for(int i=0;i<n;i++){
        if(nums[i]>max1){
            max2=max1;
            max1=nums[i];
        }else if(nums[i] > max2 ){
            max2=nums[i];
        }
      }
      m1=min1 * min2;
      m2=max1*max2;

      return m2-m1;
    }
}