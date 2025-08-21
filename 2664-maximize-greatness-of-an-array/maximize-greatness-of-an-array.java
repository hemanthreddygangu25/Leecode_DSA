class Solution {
    public int maximizeGreatness(int[] nums) {
        Arrays.sort(nums);
        if(nums.length<=0)
        {
            return 0;
        }
        int count=0,left=0,right=1;
        while(right<nums.length)
        {
            if(nums[left]<nums[right])
            {
                left++;
                right++;
                count++;
            }
            else
            {
                right++;
            }
        }
        return count;
        
    }
}