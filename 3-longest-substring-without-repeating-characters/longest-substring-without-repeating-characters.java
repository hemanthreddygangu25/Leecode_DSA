class Solution {
    public int lengthOfLongestSubstring(String s) {
        int apointer = 0;
        int bpointer = 0;
        int maxl = 0;
        HashSet<Character> x = new HashSet<>();

        while (bpointer < s.length()) {

            if (!(x.contains(s.charAt(bpointer)))) {
                x.add(s.charAt(bpointer));
                bpointer++;

                maxl = Math.max(x.size(), maxl);
            } else {
                x.remove(s.charAt(apointer));
                apointer++;
            }

        }
        return maxl;

    }

}