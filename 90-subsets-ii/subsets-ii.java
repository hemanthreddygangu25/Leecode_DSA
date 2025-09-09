class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
       List<List<Integer>> ans=new ArrayList<>();
       int n=nums.length;
       Arrays.sort(nums); 
      comb(0,n,nums,ans,new ArrayList<>());
      return ans;
        
    }
    public void comb(int s,int n,int[] nums,List<List<Integer>> ans,ArrayList<Integer> ds)
    {
     ans.add(new ArrayList(ds));
      
      for(int i=s;i<n;i++)
      {
       // if(ds.contains(nums[i])) continue;
        if ( i>s && nums[i] == nums[i - 1]) continue;
        
        ds.add(nums[i]);
        comb(i+1,n,nums,ans,ds);
        ds.remove(ds.size() - 1);
      }
        
    }
}