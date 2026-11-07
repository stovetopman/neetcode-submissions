class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0;
        int r = 0;
        int max = 0;

        Set<Character> letters = new HashSet<>();
        while (r < s.length()) {
            while (letters.contains(s.charAt(r))) {
                letters.remove(s.charAt(l));
                l++;
            }
            max = Math.max(r-l +1, max);
                letters.add(s.charAt(r));
                r++;
        }
        return Math.max(max, letters.size());
    }
}
