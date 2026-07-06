class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n=s.length();
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                if(check(s,i)){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean check(String s, int i){
        String sub=s.substring(0,i);
        StringBuilder sb=new StringBuilder();
        int t=s.length()/i;
        for(int a=0;a<t;a++){
            sb.append(sub);
        }
        return sb.toString().equals(s);
    }
}