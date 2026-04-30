class Solution {
    public int[] diStringMatch(String s) {
        int n=s.length();
        int h=n;
        int l=0;
        int []res=new int[n+1];
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='I'){
                res[i]=l;
                l++;
            } else {
                res[i]=h;
                h--;
            }
        }
        res[n]=l;
        
        return res;
    }
}