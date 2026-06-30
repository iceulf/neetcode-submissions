class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> result = new HashMap<>();

        for (String s: strs) {
            var key = sort(s);
            List<String> list = new ArrayList<String>();
            if (result.containsKey(key)) {
                list = result.get(key);
            }
            list.add(s);
            result.put(key, list);
        }

        return result.values().stream().toList();
    }

    private String sort(String s) {
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 97]++;
        }
        char[] sorted = new char[s.length()];
        int pos = 0;
        for (int i = 0; i < freq.length; i++) {
            for (int j = 0; j < freq[i]; j++) {
                sorted[pos++] = (char) (i + 97);
            }
        }
        return new String(sorted);
    }
}
