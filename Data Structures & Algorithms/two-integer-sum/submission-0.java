class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> lookup = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            int m = target - n;
            if (lookup.containsKey(m)) {
                return new int[]{lookup.get(m), i};
            }
            lookup.put(n, i);
        }

        return new int[]{};
    }
}
