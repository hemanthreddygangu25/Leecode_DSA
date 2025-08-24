class Solution {
    public int longestSubarray(int[] nums) {
      int maxi=0,count=0;
      int i=0,j=0;
      while(j<nums.length)
      {
        if(nums[j]==0)
        {
          count++;
        }
         while (count > 1) {
                if (nums[i] == 0) {
                    count--;
                }
                i++;
            }
        maxi=Math.max(j-i,maxi);
        
        j++;
      }
      return maxi;
        
    }
}