class Solution {
    public int romanToInt(String s) {
        int n=s.length();
        int a=0;
        for(int i=0;i<n;i++){
            int c=value(s.charAt(i));
            if(i<n-1 && c<value(s.charAt(i+1))){
                a-=c;
            } else {
                a+=c;
            }
        }
        return a;
    }
    public int value(char ch){
        if(ch=='I') return 1;
        if(ch=='V') return 5;
        if(ch=='X') return 10;
        if(ch=='L') return 50;
        if(ch=='C') return 100;
        if(ch=='D') return 500;
        return 1000;
    }
}