class Solution {
    public String makeSmallestPalindrome(String s) {
        char[] a=s.toCharArray();
        int n=a.length;
        int i=0,j=n-1;
        while(i<j){
            if(a[i]!=a[j]){
                if(a[i]<a[j]){
                    a[j]=a[i];
                } else {
                    a[i]=a[j];
                }
            }
                i++;
                j--;
        }
        return new String(a);
    }
}