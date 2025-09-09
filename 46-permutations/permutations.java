class Solution {
    public List<List<Integer>> permute(int[] nums) {
      List<List<Integer>> ans=new ArrayList<>();
      findcomb(0,nums,ans,new ArrayList<>());
      return ans;
        
    }
    public void findcomb(int ind,int[] nums,List<List<Integer>> ans,List<Integer> ds)
    {
      if(ind==nums.length)
      {
        ans.add(new ArrayList(ds));
        return ;
      }
      for (int i = 0; i < nums.length; i++) {
            if (ds.contains(nums[i])) continue; 
            ds.add(nums[i]);
            findcomb(ind + 1, nums, ans, ds);
            ds.remove(ds.size() - 1);
        }
    }
}