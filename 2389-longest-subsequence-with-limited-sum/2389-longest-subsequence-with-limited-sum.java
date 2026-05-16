class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        int n=queries.length;
        Arrays.sort(nums);
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            int s=0;
            int c=0;
            for( int j=0;j<nums.length;j++){
                s+=nums[j];
                if(s<=queries[i]){
                    c++;
                } 
                else {
                    break;
                    } 
            }
            arr[i]=c;
        }
        return arr;
    }
}