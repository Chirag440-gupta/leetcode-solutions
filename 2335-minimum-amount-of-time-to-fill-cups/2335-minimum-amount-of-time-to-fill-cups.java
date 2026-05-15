class Solution {
    public int fillCups(int[] amount) {
        int s=0;
        while(amount[0]>0 || amount[1]>0 || amount[2]>0){
            Arrays.sort(amount);
            if(amount[1]>0){
                amount[1]--;
                amount[2]--;
            } else {
                amount[2]--;
            }
            s++;
        }
        return s;
    }
}