class Solution {
    public int heightChecker(int[] heights) {
        int n=heights.length;
        int c=0;
        int[] arr=heights.clone();
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            if(heights[i]!=arr[i]){
                c++;
            }else{
                continue;
            }
        }
        return c;
    }
}