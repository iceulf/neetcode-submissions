class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> freq = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);

            if (!freq.containsKey(c)) {
                return false;
            }

            var nx = freq.get(c) - 1;
            freq.put(c, nx);

            if (nx == 0) {
                freq.remove(c);
            }            
        }

        return freq.isEmpty();
    }
}
