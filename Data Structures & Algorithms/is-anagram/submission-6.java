class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] freq = new int[26];
        int len = s.length();

        for (int i = 0; i < len; i++) {
            freq[s.charAt(i) - 97]++;
            freq[t.charAt(i) - 97]--;
        }

        for (int count : freq) {
            if (count != 0) return false;
        }
        return true;
    }
}