class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0 && strs==null) return "";
        String p=strs[0];
        for(int i=0;i<strs.length;i++){
            while(!strs[i].startsWith(p)){
                p=p.substring(0,p.length()-1);
                if(p.isEmpty()) return "";
            }
        }
        return p;
    }
}