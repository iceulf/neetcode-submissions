class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product = 1;
        int zeroes = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeroes += 1;
                continue;
            }
            product *= nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            if (zeroes > 1) {
                nums[i] = 0;
            } else if (nums[i] == 0) {
                nums[i] = product;
            } else {
                nums[i] = zeroes > 0 ? 0 : product / nums[i];
            }
        }

        return nums;

    }
}  
