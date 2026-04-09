class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int n=timeSeries.length;
        int t=0;
        for(int i=1;i<n;i++){
            int v=timeSeries[i]-timeSeries[i-1];
            t+=Math.min(v,duration);
        }
        return t+=duration;
    }
}