class Solution {
    public List<String> partitionString(String s) {
        List<String> x = new ArrayList<>();
        Set<String> seen = new HashSet<>();
        int i = 0, j = 0;

        while (j < s.length()) {
            String sub = s.substring(i, j + 1);
            if (seen.contains(sub)) {
                j++;
            } else {
                x.add(sub);
                seen.add(sub);
                i = j + 1;
                j = i;
            }
        }

        return x;
    }
}
