class Solution {
  public int totalMoney(int n) {
    int sum = 0, i = 1, icount = 0;
    int w = 1, wcount = 1;
    while (i <= n) {
      if (icount == 7) {
        wcount++;
        w = wcount;
        icount = 0;
      }
      icount++;
      sum += w;
      w++;
      i++;

    }
    return sum;

  }
}