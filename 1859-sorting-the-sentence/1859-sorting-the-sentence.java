class Solution {
    public String sortSentence(String s) {
        String[] words=s.split(" ");
        int n=words.length;
        String[] ans=new String[n];
        for(String w:words){
            int p=w.charAt(w.length()-1)-'0';
            String aw=w.substring(0,w.length()-1);
            ans[p-1]=aw;
        }
        return String.join(" ", ans);
    }
}