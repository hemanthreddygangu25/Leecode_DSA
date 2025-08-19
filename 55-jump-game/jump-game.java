class Solution {
    public boolean canJump(int[] nums) {
        int mc=0;
        for(int i=0;i<nums.length;i++)
        {
            int cc=0;
            if(i>mc)
            {
                return false;
            }
            mc=Math.max(mc,nums[i]+i);
        }
        return true;
        
    }
}