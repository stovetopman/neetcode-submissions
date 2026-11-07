class Solution {
    public String encode(List<String> strs) {
        String res = "";
        for (String str : strs) {
            res = res + str + "∆";
        }
        return res;
    }

    public List<String> decode(String str) {
        String[] parts = str.split("∆", -1);
        List<String> res = new ArrayList<>(Arrays.asList(parts));
        res.remove(res.size() - 1);
        return res;
    }
}
