class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        if(target.length!=arr.length) return false;
        int n=arr.length;
        boolean ans=true;
        Arrays.sort(target);
        Arrays.sort(arr);

       return Arrays.equals(target,arr);
    }
}