class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        int n1=numOnes,n2=numZeros,n3=numNegOnes;
        int n=n1+n2+n3;
     if(k<=n1) return k;
     else if(k<=n1+n2) return n1;
     else{
        int c=k-(n1+n2);
        return n1-c;
     }
    }
}