class Solution {
    public long minOperationsToMakeMedianK(int[] nums, int k) {
        Arrays.sort(nums);
        long ans=0;
        int mid=Math.abs(nums.length/2);
        ans+=Math.abs(nums[mid]-k);
        for(int i=mid-1;i>=0;i--)
        {
            if(nums[i]>k)
            {
                ans+=nums[i]-k;
            }
        }
        for(int j=mid+1;j<nums.length;j++)
        {
            if(nums[j]<k)
            {
                ans+=Math.abs(nums[j]-k);
            }
        }
        return ans;
        
    }
}