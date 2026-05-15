class Solution {
    public String removeDigit(String number, char digit) {
        int n=number.length();
        String a="";
        for(int i=0;i<n;i++){
            char ch=number.charAt(i);
            if(ch==digit){
                String s=number.substring(0,i)+
                  number.substring(i+1);
                  if(a.compareTo(s)<0){
                  a=s;
               }
            }
        }
        return a;
    }
}