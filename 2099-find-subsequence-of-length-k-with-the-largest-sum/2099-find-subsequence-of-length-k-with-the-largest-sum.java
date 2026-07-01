class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int[] temp = nums.clone();
        Arrays.sort(temp);

        HashMap<Integer, Integer> map = new HashMap<>();

        // k largest elements ki frequency store karo
        for (int i = temp.length - k; i < temp.length; i++) {
            map.put(temp[i], map.getOrDefault(temp[i], 0) + 1);
        }

        int[] ans = new int[k];
        int idx = 0;

        // Original order maintain karo
        for (int num : nums) {
            if (map.getOrDefault(num, 0) > 0) {
                ans[idx++] = num;
                map.put(num, map.get(num) - 1);
            }
        }

        return ans;
        
    }
}