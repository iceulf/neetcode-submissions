class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String s : strs) {
            sb.append(s.length()).append('#').append(s);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> decoded = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int hashIdx = str.indexOf('#', i);
            int length = Integer.parseInt(str.substring(i, hashIdx));
            int start = hashIdx + 1;
            decoded.add(str.substring(start, start + length));
            i = start + length;
        }
        return decoded;
    }
}