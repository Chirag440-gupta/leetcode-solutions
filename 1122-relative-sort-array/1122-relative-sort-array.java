class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] freq=new int[1001];
        for(int a:arr1){
            freq[a]++;
        }
     int n=arr1.length;
     int[] ans=new int[n];
     int a=0;
     for(int num:arr2){
        while(freq[num]>0){
            ans[a++]=num;
            freq[num]--;
        }
     }

     for(int i=0;i<=1000;i++){
        while(freq[i]>0){
            ans[a++]=i;;
            freq[i]--;
        }
     }
     return ans;
    }
}