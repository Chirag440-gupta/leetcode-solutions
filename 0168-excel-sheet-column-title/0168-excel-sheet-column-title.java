class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder ans=new StringBuilder();
        while(columnNumber>0){
            columnNumber--;
            int rem=columnNumber%26;
            int n=rem + 'A';
            ans.append((char)n);
            columnNumber=columnNumber / 26;
        }
        return ans.reverse().toString();
    }
}