class Solution {
    public int reflection(int x){
        int a=0;
        while(x>0){
            a=(a<<1)| (x&1);
            x>>=1;
        }
        return a;
    }
    public int[] sortByReflection(int[] nums) {
                Integer[] arr = new Integer[nums.length];

        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[i];
        }

        Arrays.sort(arr, (a, b) -> {
            int ra = reflection(a);
            int rb = reflection(b);

            if (ra != rb)
                return Integer.compare(ra, rb);

            return Integer.compare(a, b);
        });

        for (int i = 0; i < nums.length; i++) {
            nums[i] = arr[i];
        }
        return nums;
    }
}