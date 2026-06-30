class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();

        for (int n: nums) {
            freq.put(n, freq.getOrDefault(n, 0) + 1);
        }

        List<Integer> result = new ArrayList<>();

        int[] results = freq.keySet().stream()
            .sorted((a, b) -> Integer.compare(freq.get(b), freq.get(a)))
            .mapToInt(Integer::intValue)
            .toArray();

        return Arrays.copyOfRange(results, 0, k);
    }
}
