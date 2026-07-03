class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        var result = new ArrayList<List<Integer>>();
        var nmap = new HashMap<Integer, List<Integer>>();
        var visited = new HashSet<String>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (i == j) {
                    continue;
                }
                int sum = nums[i] + nums[j];
                int target = -sum;
                if (!nmap.containsKey(target)) {
                    continue;
                }
                List<Integer> indexes = nmap.get(target);
                for (int index : indexes) {
                    if (index != i || index != j) {
                        var combination = List.of(nums[i], nums[j], nums[index])
                                .stream().sorted().toList().toString();
                        if (!visited.contains(combination)) {
                            result.add(List.of(nums[i], nums[j], nums[index]));
                        }
                        visited.add(combination);
                    }
                }
            }

            nmap.putIfAbsent(nums[i], new ArrayList<>());
            nmap.get(nums[i]).add(i);
        }
        return result;
    }
}
