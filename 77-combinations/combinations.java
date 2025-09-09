class Solution {
    public List<List<Integer>> combine(int n, int k) {
      List<List<Integer>> ans=new ArrayList<>();
      comb(1,n,k,ans,new ArrayList<>());
      return ans;
        
    }
    public void comb(int s,int n,int k,List<List<Integer>> ans,ArrayList<Integer> ds)
    {
      if(ds.size()==k)
      {
        ans.add(new ArrayList(ds));
        return ;
      }
      for(int i=s;i<=n;i++)
      {
        
        ds.add(i);
        comb(i+1,n,k,ans,ds);
        ds.remove(ds.size() - 1);
      }
    }
}