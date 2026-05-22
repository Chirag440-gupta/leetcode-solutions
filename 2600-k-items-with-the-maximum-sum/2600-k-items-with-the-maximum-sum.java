class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        int n1=numOnes,n2=numZeros,n3=numNegOnes;
        int n=n1+n2+n3;
        int s=0;
        int[] arr=new int[n];
        Arrays.fill(arr,0,n1,1);
        Arrays.fill(arr,n1,n1+n2,0);
        Arrays.fill(arr,n1+n2,arr.length,-1);

        for(int i=0;i<k;i++){
            s+=arr[i];
        }
        return s;
    }
}