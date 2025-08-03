class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int[] a=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2!=0)
            {
                a[i]=1;
            }
            else
            {
                a[i]=0;
            }
        }
        HashMap<Integer,Integer> x=new HashMap<>();
        int curr=0,ps=0,res=0;
        x.put(0,1);
        for(int j:a)
        {
            curr+=j;
            res+=x.getOrDefault(curr-k,0);
            x.put(curr,x.getOrDefault(curr,0)+1);
        }
        return res;
        
    }
}