class Solution {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int n=arr.length;
        int r=n/20;
        int s=0;
        for(int i=r;i<n-r;i++){
            s+=arr[i];
        }
        return (double) s/(n-2*r);
    }
}