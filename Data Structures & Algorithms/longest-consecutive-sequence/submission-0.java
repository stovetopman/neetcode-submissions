class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> hset =  new HashSet<>();
        int max = 0;
        for (int num : nums) {
            hset.add(num);
        }

        for (int num : nums) {
            if (!hset.contains(num-1)){
                int curr = num;
                int temp = 0;
                while (hset.contains(curr)) {
                    temp++;
                    curr++;
                }
                max = Math.max(max, temp);
            }
        }

        return max;
    }
}
