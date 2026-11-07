class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hmap = new HashMap<>();
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            temp = target-nums[i];
            if (hmap.containsKey(temp)) {
                return new int[]{hmap.get(temp), i};
            } else  {
                hmap.put(nums[i], i);
            }
        }
        return new int[]{0,0};
    }
}
