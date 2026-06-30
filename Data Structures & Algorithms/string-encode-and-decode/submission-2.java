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
        int length = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '#') {
                String d = str.substring(i + 1, i + 1 + length);
                decoded.add(d);
                i += length;
                length = 0; 
                continue;
            }

            length *= 10;
            length += Integer.parseInt(str.charAt(i) + "");
        }
        return decoded;
    }
}
