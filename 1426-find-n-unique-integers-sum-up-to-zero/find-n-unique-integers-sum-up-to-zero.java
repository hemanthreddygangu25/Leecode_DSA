class Solution {
    public int[] sumZero(int n) {
        int[] a = new int[n];
        int val = 0;

        if (n % 2 != 0) {
            a[val++] = 0;
        }

        for (int i = 1; i <= n / 2; i++) {
            a[val++] = i;
            a[val++] = -i;
        }

        return a;
    }
}
