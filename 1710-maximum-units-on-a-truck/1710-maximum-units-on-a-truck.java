class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a,b)-> b[1]-a[1]);
        int u=0;
        for(int[] a:boxTypes){
            int b=Math.min(a[0], truckSize);
            u+=b*a[1];
            truckSize-=b;
        if(truckSize==0) break;
        }

        return u;
    }
}