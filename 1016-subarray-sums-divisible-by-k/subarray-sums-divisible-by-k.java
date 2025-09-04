class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int psum=0,ans=0;
        Map<Integer, Integer> x = new HashMap<>();
        x.put(0,1);
        for(int i=0;i<nums.length;i++)
        {
            psum=(psum+nums[i]%k+k)%k;
            ans+=x.getOrDefault(psum,0);
            x.put(psum,x.getOrDefault(psum,0)+1);
        }
        return ans;

        
    }
}