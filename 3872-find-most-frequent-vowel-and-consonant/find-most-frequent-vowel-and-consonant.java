class Solution {
    private boolean isVowel(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            return true;

        return false;
    }

    public int maxFreqSum(String s) {
        int arr[] = new int[26];
        int l = s.length();

        int freqVowel = 0;
        int freqConso = 0;

        for (int i = 0; i < l; i++) {
            char ch = s.charAt(i);

            if (isVowel(ch)) {
                arr[ch - 97]++;
                freqVowel = Math.max(freqVowel, arr[ch - 97]);
            } else {
                arr[ch - 97]++;
                freqConso = Math.max(freqConso, arr[ch - 97]); 
            }
        }

        return freqVowel + freqConso;

    }
}