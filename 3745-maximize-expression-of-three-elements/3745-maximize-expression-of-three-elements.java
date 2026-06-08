class Solution {
    public int maximizeExpressionOfThree(int[] nums) {
      int a=Integer.MIN_VALUE;
      int b=Integer.MIN_VALUE;
      int c=Integer.MAX_VALUE;

      for(int n:nums){
        c=Math.min(c,n);

        if(n>=a){
            b=a;
            a=n;
        } else if(n>b){
            b=n;
        }
      }
      return a+b-c;
    }
}