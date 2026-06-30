class Solution {

    public String encode(List<String> strs) {
        String encoded = "";
        for (String s: strs) {
            encoded += s.length() + "#" + s; 
        }
        return encoded;
    }

    public List<String> decode(String str) {
        List<String> decoded = new ArrayList<>();
        String length = "";
        for (int i = 0; i < str.length();) {
            if (str.charAt(i) != '#') {
                length += str.charAt(i);
                i += 1;
            } else {
                decoded.add(str.substring(i + 1, i + 1 + Integer.parseInt(length)));
                i += Integer.parseInt(length) + 1;
                length = "";
            }
        }
        return decoded;
    }
}
