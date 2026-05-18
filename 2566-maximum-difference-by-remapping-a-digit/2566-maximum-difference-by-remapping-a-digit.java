class Solution {
    public int minMaxDifference(int num) {
      String s = String.valueOf(num);
        char chMax = ' ';
        for (char c : s.toCharArray()) {
            if (c != '9') {
                chMax = c;
                break;
            }
        }

        String maxStr = s;
        if (chMax != ' ') {
            maxStr = s.replace(chMax, '9');
        }

        char chMin = s.charAt(0);
        String minStr = s.replace(chMin, '0');

        int max = Integer.parseInt(maxStr);
        int min = Integer.parseInt(minStr);

        return max - min;
    }
}