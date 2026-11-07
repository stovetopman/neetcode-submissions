class Solution {
    public String encode(List<String> strs) {
        StringBuilder res = new StringBuilder();
        for (String str : strs) {
            res.append(str).append("∆");
        }
        return res.toString();
    }

    public List<String> decode(String str) {
        String[] parts = str.split("∆", -1);
        List<String> res = new ArrayList<>(Arrays.asList(parts));
        res.remove(res.size() - 1);
        return res;
    }
}
