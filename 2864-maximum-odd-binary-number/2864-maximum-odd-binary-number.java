class Solution {
    public String maximumOddBinaryNumber(String s) {
        int one=0;
        int n=s.length();
        for(char ch : s.toCharArray()){
            if(ch=='1') one++;
        }
        int zero=n-one;
        String a="1".repeat(one-1) + "0".repeat(zero)+"1";

        return a;
    }
}