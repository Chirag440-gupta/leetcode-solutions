class Solution {
    public int[] sortByBits(int[] arr) {
        int n=arr.length;
        Integer[] ans=new Integer[n];
        for(int i=0;i<n;i++){
            ans[i]=arr[i];
        }
        Arrays.sort(ans, (a,b)->{
            Integer bitsA=Integer.bitCount(a);
            Integer bitsB=Integer.bitCount(b);

            if(bitsA==bitsB) return a-b;
        return bitsA-bitsB;
        });
        for(int i=0;i<n;i++){
            arr[i]=ans[i];
        }
        return arr;
    }
}