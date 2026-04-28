class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i=0,j=0,c=0;
        while(i<g.length && j<s.length){
            if(s[j]>=g[i]){
            c+=1;
            i=i+1;
            j=j+1;
        } else {
            j+=1;
        }
        }
        return c;
    }
}