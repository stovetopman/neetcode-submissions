class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int l = 0;
        int r = n-1;
        int mid = 0;
        while (l < r) {
            mid = l + (r-l)/2;

            if (nums[mid] > nums[r]) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        
        if (target >= nums[l] && target <= nums[n - 1]) {
            r = n - 1;
        } else { 
            r = l - 1;
            l = 0;
        }

        while (l <= r) {
            mid = l + (r-l)/2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                l = mid + 1;
            } else {
                r=mid - 1;
            }
        }
        return -1;
    }
}
