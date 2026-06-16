class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        int[] freq=new int[1001];
        for(int  n:target){
            freq[n]++;
        }
        for(int n:arr){
            freq[n]--;
        }
        for(int c:freq){
            if(c!=0) return false;
        }
        return true;
    }
}