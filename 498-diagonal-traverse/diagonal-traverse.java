class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int row = 0, col = 0;
        int m = mat.length, n = mat[0].length;
        boolean up = true;
        int[] a = new int[m * n];
        int i = 0;
        while (row < m && col < n) {
            if (up) {
                while (row >0 && col < n - 1) {
                    a[i++] = mat[row][col];
                    row--;
                    col++;

                }
                a[i++] = mat[row][col];
                if (col == n - 1) {
                    row++;
                } else {
                    col++;
                }
            } else {
                while (col > 0 && row < m - 1) {
                    a[i++] = mat[row][col];
                    row++;
                    col--;
                }
                a[i++] = mat[row][col];
                if (row == m - 1) {
                    col++;
                } else {
                    row++;
                }
            }
            up = !up;

        }
        return a;

    }
}