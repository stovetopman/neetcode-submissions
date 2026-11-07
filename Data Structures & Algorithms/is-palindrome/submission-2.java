class Solution {
    public boolean isPalindrome(String s) {
        String a = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        int r = s.length()-1;
        int l = 0;
        while (l< r) {
            while (l<r && a.indexOf(s.charAt(l)) == -1) l++;
            while (l<r && a.indexOf(s.charAt(r)) == -1) r--;
            if (Character.toLowerCase(s.charAt(l)) == Character.toLowerCase(s.charAt(r))) {
                l++;
                r--;
            } else return false;
        }
        return true;
    }
}
