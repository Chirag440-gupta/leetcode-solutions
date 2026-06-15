class Solution {
    public int[] arrayRankTransform(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=arr.length;
        int[] cl=arr.clone();
        Arrays.sort(cl);
        int[] ans=new int[n];

int rank = 1;

for(int i = 0; i < n; i++){
    if(!map.containsKey(cl[i])){
        map.put(cl[i], rank++);
    }
}
for(int i = 0; i < n; i++){
    ans[i] = map.get(arr[i]);
}
return ans;
    }
}