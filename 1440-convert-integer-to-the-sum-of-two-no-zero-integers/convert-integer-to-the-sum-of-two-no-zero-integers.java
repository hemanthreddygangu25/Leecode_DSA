class Solution {
    public int[] getNoZeroIntegers(int n) {
        int i = 1, j = n-1;
        while (String.valueOf(i).contains("0") || String.valueOf(j).contains("0")) {
            i++;
            j--;
        }
        return new int[]{i, j};
    }
}