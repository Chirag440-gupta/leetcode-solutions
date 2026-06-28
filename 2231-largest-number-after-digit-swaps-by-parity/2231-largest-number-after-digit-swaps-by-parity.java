class Solution {
    public int largestInteger(int num) {
            char[] digits = String.valueOf(num).toCharArray();

        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();

        for (char ch : digits) {
            int d = ch - '0';
            if (d % 2 == 0)
                even.add(d);
            else
                odd.add(d);
        }

        even.sort(Collections.reverseOrder());
        odd.sort(Collections.reverseOrder());

        int e = 0, o = 0;
        StringBuilder ans = new StringBuilder();

        for (char ch : digits) {
            int d = ch - '0';
            if (d % 2 == 0)
                ans.append(even.get(e++));
            else
                ans.append(odd.get(o++));
        }

        return Integer.parseInt(ans.toString());
    }
}