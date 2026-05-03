class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int n=arr.length;
        int s=0;
        for(int i:arr){
            s+=i;
        }
        if(s%3!=0) return false;
        int a=s/3,t=0,f=0;
        for(int i=0;i<n;i++){
                t+=arr[i];
               if(t==a){
                f++;
                t=0;
               }
        }

        return f>=3;
    }
}