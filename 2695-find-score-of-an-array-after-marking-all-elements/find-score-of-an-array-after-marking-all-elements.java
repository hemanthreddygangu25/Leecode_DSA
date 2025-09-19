class Solution {
    public long findScore(int[] nums) {
      return findscore(nums);
        
    }
  public long findscore(int[] nums)
  {
    TreeSet<int[]> set=new TreeSet<>((a,b)->{
        if(a[0]==b[0]) return a[1] - b[1];
        return a[0] - b[0];
      });
    for(int i=0;i<nums.length;i++)
    {
      set.add(new int[]{nums[i],i});
    }
    long ans=0;
    while(!set.isEmpty())
    {
      int[] p=set.first();
      int idx=p[1];
      ans+=p[0];
      set.remove(p);
      if(idx-1>=0)
      {
        int[] left=new int[]{nums[idx-1],idx-1};
        if(set.contains(left))
        {
          set.remove(left);
        }
      }
      if(idx+1<nums.length)
      {
        int[] right=new int[]{nums[idx+1],idx+1};
        if(set.contains(right))
        {
          set.remove(right);
        }
      }

    }
    return ans;
  }
  
}