class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int min = nums[0];

        while (true) {
            int mid = (left + right) / 2;
            min = nums[mid] < min ? nums[mid] : min;
            if (left == right) {
                break;
            }
            if (nums[mid] < nums[left] && nums[left] > nums[right]) {
                right = mid - 1;
            } else if (nums[mid] > nums[right] && nums[right] < nums[left]) {
                left = mid + 1;
            } else if (nums[left] < nums[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return min;
    }
}
