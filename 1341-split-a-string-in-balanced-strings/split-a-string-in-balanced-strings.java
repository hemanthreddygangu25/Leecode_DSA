class Solution {
    public int balancedStringSplit(String s) {
      int count=0,ans=0;
      for(int i:s.toCharArray())
      {
        if(i=='R')
        {
          count++;
        }
        else if(i=='L')
        {
          count--;
        }
        if(count==0)
        {
          ans++;

        }
      }
      return ans;
        
    }
}