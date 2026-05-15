class Solution {
    public int fillCups(int[] amount) {
        int s=amount[0]+amount[1]+amount[2];
        int m=Math.max(amount[0], Math.max(amount[1],amount[2]));

        return Math.max(m,(s+1)/2);
    }
}