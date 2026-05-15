class Solution {
    public int minimumSum(int num) {
        String s=Integer.toString(num);
        char[] a=s.toCharArray();
        Arrays.sort(a);
        int n1=(a[0]-'0')*10+(a[2]-'0');
        int n2=(a[1]-'0')*10 + (a[3]-'0');
         
         return n1+n2;
    }
}