class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
       List<List<Integer>> ans=new ArrayList<>();
      findcomb(1,k,n,ans,new ArrayList<>());
      return ans;
        
    }
    public void findcomb(int ind,int k,int n,List<List<Integer>> ans,List<Integer> ds)
    {
      if(ds.size()==k)
      {
        if(n==0)
        {
          ans.add(new ArrayList<>(ds));
        }
        return ;
      }
      for(int i=ind;i<=9;i++)
      {
        if(ds.contains(i)) continue;
        if(i>n) break;
        ds.add(i);
        findcomb(i+1,k,n-i,ans,ds);
        ds.remove(ds.size()-1);

      }
      
        
    }
}