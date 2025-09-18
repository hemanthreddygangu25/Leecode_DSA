class Solution {
    public int longestSubsequence(String s, int k) {
         int oc = 0, zc = 0, ans = 0;
        for (int j = 0; j < s.length(); j++) {
            if (s.charAt(j) == '0') {
                zc++;
            }
        }
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '1') {
                int shift = s.length() - 1 - i;
                if (shift >= 63) { 
                    continue;
                }
                long add = 1L << shift;
                if (ans + add <= k) {
                    ans += add;
                    oc++;
                }
            }
        }
        return oc + zc;
        
    }
}