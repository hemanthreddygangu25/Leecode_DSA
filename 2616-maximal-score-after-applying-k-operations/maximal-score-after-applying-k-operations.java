class Solution {
    public long maxKelements(int[] nums, int k) {
      PriorityQueue<Integer> x=new PriorityQueue<>(Collections.reverseOrder());
      for(int i:nums)
      {
        x.add(i);
      }
      long i=0,sum=0;
      while(i<k)
      {
        int val=x.poll();
        sum+=val;
        val=(int)Math.ceil(val/3.0);
        System.out.println(val);
        x.add(val);
        i++;

      }
        return sum;
    }
}