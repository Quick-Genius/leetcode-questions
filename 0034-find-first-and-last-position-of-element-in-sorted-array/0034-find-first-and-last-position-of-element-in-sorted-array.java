class Solution {
    public int[] searchRange(int[] nums, int target) {
        return new int[]{
            lowerBound(nums, target),
            upperBound(nums, target)
        };
    }

    private int lowerBound(int[] nums, int target) {
        int l = 0, r = nums.length - 1, ans = -1;

        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] >= target) {
                if (nums[mid] == target) ans = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return ans;
    }

    private int upperBound(int[] nums, int target) {
        int l = 0, r = nums.length - 1, ans = -1;

        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] <= target) {
                if (nums[mid] == target) ans = mid;
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }

        return ans;
    }
}