class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
      List<List<Integer>> ans=new ArrayList<>();
      findcomb(0,candidates,target,ans,new ArrayList<>());
      return ans;
        
    }
    public void findcomb(int ind,int[] candidates,int target,List<List<Integer>> ans,List<Integer> ds)
    {
      if(ind==candidates.length)
      {
        if(target==0)
        {
          ans.add(new ArrayList<>(ds));
        }
        return ;
      }
      if(candidates[ind]<=target)
      {
        ds.add(candidates[ind]);
        findcomb(ind,candidates,target-candidates[ind],ans,ds);
        ds.remove(ds.size()-1);

      }
      findcomb(ind+1,candidates,target,ans,ds);
    }
}