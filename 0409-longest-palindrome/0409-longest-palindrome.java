class Solution {
    public int longestPalindrome(String s) {
         int[] freq=new int[128];
         for(char ch:s.toCharArray()){
            freq[ch]++;
         }
         int len=0;
         for(int c:freq){
            len+=(c/2)*2;
         }
         if(len < s.length()){
            len+=1;
         }
         return len;
    }
}