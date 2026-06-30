class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> freq = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char sc = s.charAt(i);
            char tc = t.charAt(i);
            freq.put(sc, freq.getOrDefault(sc, 0) + 1);
            freq.put(tc, freq.getOrDefault(tc, 0) - 1);
        }

        for (int c: freq.values()) {
            if (c != 0) {
                return false;
            }
        }

        return true;
    }
}
