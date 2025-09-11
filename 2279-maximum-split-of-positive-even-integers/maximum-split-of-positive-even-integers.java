class Solution {
    public List<Long> maximumEvenSplit(long finalSum) {
      List<Long> x = new ArrayList<>();
      if(finalSum%2!=0) return x;
      long i=2;
      while(i<=finalSum)
      {
        x.add(i);
        finalSum-=i;
        i+=2;
      }
      if (finalSum > 0) {
            x.set(x.size() - 1, x.get(x.size() - 1) + finalSum);
        }
        return x;
    }
}