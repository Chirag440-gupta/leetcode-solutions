class Solution {
    public int minimumMoves(String s) {
        int m=0;
        for(int i=0;i<s.length();i++){
        if(s.charAt(i) =='X' ) {
         m++;
        i+=2;
        }
        }
        return m;
    }
}