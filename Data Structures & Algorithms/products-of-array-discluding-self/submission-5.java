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
            if (nums[i] == 0) {
                nums[i] = zeroes > 1 ? 0 : product;
            } else if (zeroes > 0) {
                nums[i] = 0;
            } else {
                nums[i] = product / nums[i];
            }
        }

        return nums;

    }
}  
