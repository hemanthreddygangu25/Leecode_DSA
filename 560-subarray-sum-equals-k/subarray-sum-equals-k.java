class Solution {
    public int subarraySum(int[] nums, int k) {
        int ps=0,res=0;
        int curr=0;
        HashMap<Integer,Integer> x=new HashMap<>();
        x.put(0,1);
        for(int i:nums)
        {
            curr+=i;
            res+=x.getOrDefault(curr-k,0);
            x.put(curr,x.getOrDefault(curr,0)+1);
        }
        return res;
        
    }
}