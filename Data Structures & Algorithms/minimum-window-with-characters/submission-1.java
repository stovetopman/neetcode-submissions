class Solution {
    public String minWindow(String s, String t) {
        int[] need = new int[128];
        for (char ch : t.toCharArray()) need[ch]++;

        int missing = t.length();
        int l = 0;
        int bestStart = 0;
        int bestLen = Integer.MAX_VALUE;

        for (int r = 0; r < s.length(); r++) {
            if (need[s.charAt(r)]-- > 0)
                missing--;

            while (missing == 0) {
                if (r - l + 1 < bestLen) {
                    bestLen = r - l + 1;
                    bestStart = l;
                }

                if (++need[s.charAt(l)] > 0)
                    missing++;
                l++;
            }
        }
        return bestLen == Integer.MAX_VALUE ? "" : s.substring(bestStart, bestStart + bestLen);
    }
}
