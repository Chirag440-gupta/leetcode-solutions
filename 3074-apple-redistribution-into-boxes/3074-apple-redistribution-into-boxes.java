class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int n=capacity.length;
        int a=0;
        int s=0;
        for(int i:apple){
            s+=i;
        }
        Arrays.sort(capacity);
       int c=0;
       int su=0;
       for(int i=n-1;i>=0;i--){
        su+=capacity[i];
        c++;
        if(su>=s){
        return c;
        }
       }
       return c;
    }
}