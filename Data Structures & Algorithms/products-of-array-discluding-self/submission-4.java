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

        int[] output = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                output[i] = zeroes > 1 ? 0 : product;
            } else if (zeroes > 0) {
                output[i] = 0;
            } else {
                output[i] = product / nums[i];
            }
        }

        return output;

    }
}  
