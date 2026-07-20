class Solution {
    public int distributeCandies(int[] candyType) {
        int n=candyType.length;
        HashSet<Integer> set=new HashSet<>();
        for(int s:candyType){
            set.add(s);
        }
        return Math.min(set.size(), n/2);
    }
}