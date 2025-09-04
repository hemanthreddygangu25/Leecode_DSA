class Solution {
    public int repeatedNTimes(int[] nums) {
        HashSet<Integer> x=new HashSet<>();
        for(int i:nums)
        {
            if(x.contains(i))
            {
                return i;
            }
            x.add(i);
        }
        return 0;
    }
}