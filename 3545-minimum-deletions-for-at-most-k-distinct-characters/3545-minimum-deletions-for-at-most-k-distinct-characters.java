class Solution {
    public int minDeletion(String s, int k) {
        int[] freq=new int[26];
        for(char ch:s.toCharArray()){
            freq[ch-'a']++;
        }
        ArrayList<Integer>list=new ArrayList<>();
        for(int x:freq){
            if(x>0) list.add(x);
        }
        int n=list.size();
        if(n<=k) return 0;
        Collections.sort(list);

        int a=0;
        int r=n-k;
        for(int i=0;i<r;i++){
            a+=list.get(i);
        }
        return a;
    }

}