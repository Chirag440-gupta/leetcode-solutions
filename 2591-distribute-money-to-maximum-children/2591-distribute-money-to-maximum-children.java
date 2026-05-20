class Solution {
    public int distMoney(int money, int children) {
        if(money<children) return -1;
        money-=children;
        int c=Math.min(money/7,children);
        if(c==children && money>children*7) c--;
        else if(c==children-1 && money%7==3) c--;

        return c;
    }
}