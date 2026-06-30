class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> result = new HashMap<>();

        for (String s: strs) {
            char[] carr = s.toCharArray();
            Arrays.sort(carr);
            var key = new String(carr);
            List<String> list = new ArrayList<String>();
            if (result.containsKey(key)) {
                list = result.get(key);
            }
            list.add(s);
            result.put(key, list);
        }

        return result.values().stream().toList();
    }
}
