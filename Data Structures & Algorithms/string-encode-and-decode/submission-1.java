class Solution {

    public String encode(List<String> strs) {
        if (strs.isEmpty()) {
            return "";
        }
        StringBuilder res = new StringBuilder();
        for (String str : strs) {
            res.append(str.length()).append(',');
        }
        res.append('#');
        for (String str : strs) {
            res.append(str);
        }
        return res.toString();
    }

    public List<String> decode(String str) {
        if (str.length() == 0) {
            return new ArrayList<>();
        }                                  // <-- closed early here, rest was trapped inside

        List<String> res = new ArrayList<>();
        List<Integer> sizes = new ArrayList<>();
        int i = 0;

        while (str.charAt(i) != '#') {
            StringBuilder sb = new StringBuilder();
            while (str.charAt(i) != ',') {
                sb.append(str.charAt(i));
                i++;
            }
            sizes.add(Integer.parseInt(sb.toString()));
            i++; // skip the ','
        }

        i++; // skip the '#'

        for (int sz : sizes) {
            res.add(str.substring(i, i + sz));
            i += sz;
        }

        return res;
    }
}