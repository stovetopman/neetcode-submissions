class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        String open = "({[";
        if (s.length() %2 != 0) return false;

        for (Character c : s.toCharArray()) {
            if (open.indexOf(c) != -1) {
                stack.addLast(c);
            } else {
                Character temp = stack.peekLast();
                if (temp==null || Math.abs(temp - c) > 3) return false;
                stack.removeLast();
            }
        }
        if (!stack.isEmpty()) return false;
        return true;
    }
}
