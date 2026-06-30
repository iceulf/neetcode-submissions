class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> freq = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char sc = s.charAt(i);
            char tc = t.charAt(i);

            if (sc == tc) continue;

            var scv = freq.getOrDefault(sc, 0) + 1;
            var tcv = freq.getOrDefault(tc, 0) - 1;
            freq.put(sc, scv);
            freq.put(tc, tcv);

            if (tcv == 0) {
                freq.remove(tc);
            }
            if (scv == 0) {
                freq.remove(sc);
            }
        }

        return freq.isEmpty();
    }
}
