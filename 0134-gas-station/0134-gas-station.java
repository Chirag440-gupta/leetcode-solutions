class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int to=0;
        int tn=0;
        int s=0;
        for(int i=0;i<gas.length;i++){
            int d=gas[i]-cost[i];
            to+=d;
            tn+=d;

            if(tn<0){
                s=i+1;
                tn=0;
            }
        }
            if(to<0) return -1;
        return s;
    }
}