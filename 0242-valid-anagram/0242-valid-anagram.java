class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        int[] co=new int[26];

        for(int i=0 ; i<s.length() ; i++){
           co[s.charAt(i) - 'a'] ++;
            co[t.charAt(i) - 'a']--;
        }
        for(int c : co){
            if(c!=0) return false;
        }
        return true;
    }
}