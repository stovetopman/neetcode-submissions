class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
      Arrays.sort(nums);
      int n = nums.length;
      int l = 0;
      int r = n-1;
      int temp = 0;
      for (int i = 0; i < n; i++) {
        if (i> 0 && nums[i] == nums[i-1]) continue;
        l = i+1;
        r = n-1;
        while (l < r) {
            temp = nums[l] + nums[r] + nums[i];
            if (temp == 0) {
                res.add(List.of(nums[l], nums[r], nums[i]));
                l++;
                r--;
                while (l < r && nums[l] == nums[l-1]) {
                    l++;
                }
                while (l < r && nums[r] == nums[r+1]) {
                    r--;
                }
            } else if (temp > 0) {
                r--;
            } else if (temp < 0) {
                l++;
            }
        }
      }
      return res;
    }
}
