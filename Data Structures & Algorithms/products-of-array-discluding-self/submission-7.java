class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product = 1;
        boolean hasZero = false;
        int zeroIndex = -1;
        int[] output = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                if (hasZero) {
                    return output;
                }
                zeroIndex = i;
                hasZero = true;
                continue;
            }
            product *= nums[i];
        }

        if (hasZero) {
            output[zeroIndex] = product;
            return output;
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] =  product / nums[i];
        }

        return nums;
    }
}  
