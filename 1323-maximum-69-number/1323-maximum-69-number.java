class Solution {
    public int maximum69Number (int num) {
        String s=String.valueOf(num);
        int a=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='6'){
                s=s.substring(0,i) +'9' +s.substring(i+1);
                break;
            } 
        }
        int r=Integer.parseInt(s);
        return r;
    }
}