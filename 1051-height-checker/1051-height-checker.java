class Solution {
    public int heightChecker(int[] heights) {
      int[] freq=new int[101];
      int n=heights.length;
      for(int h:heights){
        freq[h]++;
      }
      int c=0;
      int idx=0;
      for(int i=1;i<=100;i++){
        while(freq[i]>0){
        if(heights[idx]!=i){
            c++;
        }
        idx++;
        freq[i]--;
      }
      }
      return c;
    }

}