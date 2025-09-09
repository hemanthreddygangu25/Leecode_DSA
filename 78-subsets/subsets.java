class Solution {
    public List<List<Integer>> subsets(int[] nums) {
       List<List<Integer>> ans=new ArrayList<>();
       int n=nums.length;
      comb(0,n,nums,ans,new ArrayList<>());
      return ans;
        
    }
    public void comb(int s,int n,int[] nums,List<List<Integer>> ans,ArrayList<Integer> ds)
    {
      
        ans.add(new ArrayList(ds));
        
      
      for(int i=s;i<n;i++)
      {
        
        ds.add(nums[i]);
        comb(i+1,n,nums,ans,ds);
        ds.remove(ds.size() - 1);
      }
        
    }
}