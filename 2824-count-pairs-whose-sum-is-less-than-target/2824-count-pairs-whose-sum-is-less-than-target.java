class Solution {
    public int countPairs(List<Integer> nums, int target) {
         Collections.sort(nums);

        int left = 0;
        int right = nums.size() - 1;
        int count = 0;

        while (left < right) {
            if (nums.get(left) + nums.get(right) < target) {
                // left ke saath left+1 se right tak sab valid honge
                count += (right - left);
                left++;
            } else {
                right--;
            }
        }

        return count;
    }
}