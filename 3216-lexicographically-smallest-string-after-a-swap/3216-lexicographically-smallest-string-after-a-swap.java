class Solution {
    public String getSmallestString(String s) {
        char[] ch=s.toCharArray();
        int n=ch.length;
        for(int i=0;i<n-1;i++){
            int a=ch[i]-'0';
            int b=ch[i+1]-'0';
            if((a%2==b%2)&& ch[i]>ch[i+1]){
                char tmp=ch[i];
                ch[i]=ch[i+1];
                ch[i+1]=tmp;
                break;
            }
        }
        return new String(ch);
    }
}